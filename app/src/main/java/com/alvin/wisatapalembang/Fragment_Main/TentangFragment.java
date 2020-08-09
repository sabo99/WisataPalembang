package com.alvin.wisatapalembang.Fragment_Main;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.alvin.wisatapalembang.Fragment_Main.Fragment_Tentang.AppInfoFragment;
import com.alvin.wisatapalembang.Fragment_Main.Fragment_Tentang.ContactUsFragment;
import com.alvin.wisatapalembang.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class TentangFragment extends Fragment {

    ImageButton ibContact, ibInfo;

    public TentangFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tentang, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ibContact = view.findViewById(R.id.ib_contactUs);
        ibInfo = view.findViewById(R.id.ib_appInfo);

        ibContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager FM = getFragmentManager();
                ContactUsFragment CF = new ContactUsFragment();

                if (FM != null){
                    FM.beginTransaction()
                            .replace(R.id.frame_container, CF, ContactUsFragment.class.getSimpleName())
                            .addToBackStack(null)
                            .commit();
                }
            }
        });

        ibInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager FM = getFragmentManager();
                AppInfoFragment AF = new AppInfoFragment();

                if (FM != null){
                    FM.beginTransaction()
                            .replace(R.id.frame_container, AF, AppInfoFragment.class.getSimpleName())
                            .addToBackStack(null)
                            .commit();
                }
            }
        });
    }
}
