package com.alvin.wisatapalembang.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.alvin.wisatapalembang.R;

public class SlideAdapter extends PagerAdapter {

    Context context;
    LayoutInflater inflater;

    // List of Img
    public int[] listImg = {
            R.drawable.slide1,
            R.drawable.slide2,
            R.drawable.slide3,
            R.drawable.slide4,
            R.drawable.slide5,
            R.drawable.slide7,
            R.drawable.slide8,
            R.drawable.slide6,
            R.drawable.slide9,
            R.drawable.slide10
    };


    // List of Title
    public String[] listTitle = {
            "VIRGO RIAND",
            "Ferry Krisnamurti",
            "Ranny Priharitiny",
            "muaz beck",
            "frank ivan",
            "Jalan Hendi_",
            "urfi ramadhani",
            "Tasyanda Ida",
            "Zahloe Zha",
            "Riko Sabuea"
    };

    // List of Deks
//    public String[] listDeks = {
//                  "Jembatan Ampera (Amanat penderitaan rakyat) adalah sebuah jembatan di Kota Palembang, Provinsi Sumatra Selatan, Indonesia."
//            ,"Kuto Besak adalah bangunan keraton yang pada abad XVIII menjadi pusat Kesultanan Palembang."
//            ,"Museum ini didirikan di bekas bangunan rumah residen kolonial Sumatra Selatan abad ke-19. Bangunan ini juga menjadi gedung dinas pariwisata Palembang. "
//            ,"Masjid Agung Sultan Mahmud Badaruddin I Jayo Wikramo atau biasa disebut Masjid Agung Palembang adalah sebuah masjid paling besar di Kota Palembang, Sumatra Selatan."
//            ,"Taman Kambang Iwak merupakan taman kota yang sudah ada sejak tahun 1900-an. Taman yang awalnya dibangun untuk orang keturunan Belanda sebagai tampat olahraga ini, memiliki danau di bagian tengahnya. "
//    };

    public int[] listBgColor = {
            Color.TRANSPARENT,
            Color.TRANSPARENT,
            Color.TRANSPARENT,
            Color.TRANSPARENT,
            Color.TRANSPARENT,
            Color.TRANSPARENT,
            Color.TRANSPARENT,
            Color.TRANSPARENT,
            Color.TRANSPARENT,
            Color.TRANSPARENT
    };


    public SlideAdapter(Context context){
        this.context = context;
    }


    @Override
    public int getCount() {
        return listImg.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slider_item, container,false);

        LinearLayout layoutSlide = view.findViewById(R.id.sliderLinierLayout);
        ImageView imgSlide = view.findViewById(R.id.iv_slideItemImg);
        TextView tvTitle = view.findViewById(R.id.tv_title);

        layoutSlide.setBackgroundColor(listBgColor[position]);
        imgSlide.setImageResource(listImg[position]);
        tvTitle.setText("Photo By " + listTitle[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }
}
