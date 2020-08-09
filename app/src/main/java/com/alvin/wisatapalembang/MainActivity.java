package com.alvin.wisatapalembang;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;

import com.alvin.wisatapalembang.Fragment_Main.BerandaFragment;
import com.alvin.wisatapalembang.Fragment_Main.TentangFragment;
import com.alvin.wisatapalembang.Fragment_Main.WisataFragment;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.snackbar.BaseTransientBottomBar;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bn_menu;
    private FrameLayout frame_container;
    private CardView cardBotNavView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tampilFragment(new BerandaFragment());

        bn_menu = findViewById(R.id.bn_menu);
        frame_container = findViewById(R.id.frame_container);
        cardBotNavView = findViewById(R.id.cardBotNavView);

        bn_menu.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment FR = null;
                switch (item.getItemId()){
                    case R.id.menu_beranda :
                        FR = new BerandaFragment();
                        break;
                    case R.id.menu_wisata :
                        FR = new WisataFragment();
                        break;
                    case R.id.menu_tentang :
                        FR = new TentangFragment();
                        break;
                }
                return tampilFragment(FR);
            }
        });

    }

    private boolean tampilFragment(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }



}
