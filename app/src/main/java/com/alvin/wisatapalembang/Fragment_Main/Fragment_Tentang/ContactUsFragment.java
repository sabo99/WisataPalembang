package com.alvin.wisatapalembang.Fragment_Main.Fragment_Tentang;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.support.v4.app.INotificationSideChannel;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.alvin.wisatapalembang.R;
import com.google.android.gms.common.api.Result;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactUsFragment extends Fragment {

    ImageView iv1, iv2;
    Button btnNext;
    EditText etProblem;

    final int kodeGallery = 100, kodeKamera = 99;
    Uri img;

    public ContactUsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact_us, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        iv1 = view.findViewById(R.id.iv_addImg1);
        iv2 = view.findViewById(R.id.iv_addImg2);
        btnNext = view.findViewById(R.id.btn_Next);
        etProblem = view.findViewById(R.id.et_problem);

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(i, kodeGallery);
            }
        });

        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(i, kodeGallery);
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text = null;
                if (etProblem.getText().toString() != null){
                     text = etProblem.getText().toString();
                }

                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_EMAIL, new String[] {"kyoto.set25@gmail.com"});
                i.putExtra(Intent.EXTRA_SUBJECT, "Bug Report!");
                i.putExtra(Intent.EXTRA_TEXT, text);
                startActivity(Intent.createChooser(i, "Choose Email"));

//                Intent i = new Intent(Intent.ACTION_SENDTO,
//                        Uri.fromParts( "mailto",
//                                "kyoto.set25@gmail.com", ContactUsFragment.class.getSimpleName()));
//                i.putExtra(Intent.EXTRA_SUBJECT,"Email");
//                i.putExtra(Intent.EXTRA_TEXT, text);
//                startActivity(Intent.createChooser(i, "Feedback"));

            }
        });
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == kodeGallery && requestCode == kodeKamera){
            img = data.getData();
            iv1.setImageURI(img);
            iv2.setImageURI(img);
        }

    }
}
