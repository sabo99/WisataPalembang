package com.alvin.wisatapalembang.Fragment_Main;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.alvin.wisatapalembang.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetailFragment extends Fragment {

    public static final String name = "name";
    public static final String deskripsi = "desk";
    public static final String alamat = "al";

    ImageView ivImgDetail;
    EditText etNameDetail, etAddDetail , etDeskDetail;
    Button btnSearch;

    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        etNameDetail = view.findViewById(R.id.et_nameDetail);
        etAddDetail = view.findViewById(R.id.et_addressDetail);
        etDeskDetail = view.findViewById(R.id.et_deskDetail);
        btnSearch = view.findViewById(R.id.btn_location);
        ivImgDetail = view.findViewById(R.id.iv_imgDetail);

        etNameDetail.setText(getArguments().getString(name));
        etAddDetail.setText(getArguments().getString(alamat));
        etDeskDetail.setText(getArguments().getString(deskripsi));
        ivImgDetail.setImageResource(getArguments().getInt("img"));

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=" + etAddDetail.getText().toString())));
            }
        });

    }
}
