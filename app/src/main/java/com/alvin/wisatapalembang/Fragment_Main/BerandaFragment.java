package com.alvin.wisatapalembang.Fragment_Main;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.alvin.wisatapalembang.Adapter.SlideAdapter;
import com.alvin.wisatapalembang.R;
import com.ms.square.android.expandabletextview.ExpandableTextView;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;


/**
 * A simple {@link Fragment} subclass.
 */
public class BerandaFragment extends Fragment {


    private ViewPager viewPager;
    private SlideAdapter adapter;

    private ExpandableTextView expTvSejarah;

    private String longTextSejarah =
            "Asal usul nama Palembang mempunyai beberapa versi. Salah satu versi mengaitkan Palembang dengan kata dalam bahasa Jawa, \"limbang\", yang berarti membersihkan biji atau logam dari tanah atau benda-benda luar lain. Pemisahan dilakukan dengan bantuan alat berupa keranjang kecil untuk mengayak tanah berkandungan logam atau biji di aliran sungai. " +
                    "\"Pa\" adalah kata depan yang dipakai orang Jawa untuk menunjuk suatu tempat berlangsungnya usaha atau keadaan. Versi ini terkait erat dengan peran Palembang pada masa lalu sebagai tempat mencuci emas dan biji timah. Versi lain menghubungkan Palembang dengan kata \"lemba\", yang berarti tanah yang dihanyutkan air ke tepi.\n" +
            "Kota ini dianggap sebagai salah satu pusat dari kerajaan Sriwijaya, Serangan Rajendra Chola dari Kerajaan Chola pada tahun 1025, menyebabkan kota ini hanya menjadi pelabuhan sederhana yang tidak berarti lagi bagi para pedagang asing.\n" +
            "Selanjutnya berdasarkan kronik Tiongkok nama Pa-lin-fong yang terdapat pada buku Chu-fan-chi yang ditulis pada tahun 1178 oleh Chou-Ju-Kua dirujuk kepada Palembang.\n" +
            "Berdasarkan kisah Kidung Pamacangah dan Babad Arya Tabanan disebutkan seorang tokoh dari Kediri yang bernama Arya Damar sebagai bupati Palembang turut serta menaklukan Bali bersama dengan Gajah Mada Mahapatih Majapahit pada tahun 1343.\n" +
            "Pada awal abad ke-15, kota Palembang diduduki perompak Chen Zuyi yang berasal dari Tiongkok. Armada bajak laut Chen Zuyi kemudian ditumpas oleh Laksamana Cheng Ho pada tahun 1407.\n" +
            "Kemudian sekitar tahun 1513, Tomé Pires seorang apoteker Portugis menyebutkan Palembang, telah dipimpin oleh seorang patih yang ditunjuk dari Jawa yang kemudian dirujuk kepada kesultanan Demak serta turut serta menyerang Malaka yang waktu itu telah dikuasai oleh Portugis.\n" +
            "Palembang muncul sebagai kesultanan pada tahun 1659 dengan Sri Susuhunan Abdurrahman sebagai raja pertamanya. Namun pada tahun 1823 kesultanan Palembang dihapus oleh pemerintah Hindia Belanda. Setelah itu Palembang dibagi menjadi dua keresidenan besar dan permukiman di Palembang dibagi menjadi daerah Ilir dan Ulu.";


    CarouselView carouselView;
    int [] img = {
            R.drawable.kuliner1,
            R.drawable.kuliner2,
            R.drawable.kuliner3,
            R.drawable.kuliner4,
            R.drawable.kuliner5,
            R.drawable.kuliner6,
            R.drawable.kuliner7,
            R.drawable.kuliner8,
            R.drawable.kuliner9
    };

    public BerandaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_beranda, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewPager = view.findViewById(R.id.viewpagerTempat);

        adapter = new SlideAdapter(getContext());
        viewPager.setAdapter(adapter);

        // Sejarah
        expTvSejarah = view.findViewById(R.id.expand_tvSejarah);
        expTvSejarah.setText(longTextSejarah);


        // CarouselView
        carouselView = view.findViewById(R.id.carouselView);
        carouselView.setImageListener(imageListener);
        carouselView.setPageCount(img.length);


    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(img[position]);
        }
    };
}
