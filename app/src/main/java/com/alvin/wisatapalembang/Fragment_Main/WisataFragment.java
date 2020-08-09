package com.alvin.wisatapalembang.Fragment_Main;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.alvin.wisatapalembang.Adapter.CardViewAdapter;
import com.alvin.wisatapalembang.R;
import com.alvin.wisatapalembang.Wisata;
import com.alvin.wisatapalembang.WisataData;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class WisataFragment extends Fragment {

    private RecyclerView rvWisata;
    private ArrayList<Wisata> listWisita = new ArrayList<>();

    public WisataFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_wisata, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rvWisata = view.findViewById(R.id.rv_wisata);
        rvWisata.setHasFixedSize(true);

        showRV();
        listWisita.addAll(WisataData.getListWisata());
    }

    private void showRV(){
        // rvWisata.setLayoutManager(new LinearLayoutManager(this)));
        // Hanya untuk Activity Biasa

        CardViewAdapter cva = new CardViewAdapter(listWisita);
        rvWisata.setLayoutManager(new LinearLayoutManager(getActivity()));

        // Clear Item / Refresh
        listWisita.clear();
        rvWisata.setAdapter(cva);
//        cva.notifyDataSetChanged();


        // Detail Fragment
        cva.setOnItemClickCallBack(new CardViewAdapter.OnItemClickCallBack() {
            @Override
            public void onItemClicked(Wisata data) {
                showDetailFragment(data);
            }
        });

    }

    private void showDetailFragment(Wisata wisata){

        DetailFragment DF = new DetailFragment();
        Bundle bundle = new Bundle();

        bundle.putInt("img", wisata.getImg());
        bundle.putString(DetailFragment.name, wisata.getName());
        bundle.putString(DetailFragment.alamat, wisata.getAddress());
        bundle.putString(DetailFragment.deskripsi, wisata.getDesk());

        DF.setArguments(bundle);

        FragmentManager FM = getFragmentManager();

        if (FM != null){
            FM.beginTransaction()
                    .replace(R.id.frame_container, DF, DetailFragment.class.getSimpleName())
                    .addToBackStack(null)
                    .commit();
        }


    }


}
