package com.example.smartfarm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.net.Uri;
import android.os.Bundle;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstpage);
        viewPager=findViewById(R.id.viewpager);
        tabLayout=findViewById(R.id.table);
      //  customVideoView=findViewById(R.id.VideoView);
        //customVideoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.drawable.));
    }
//    private CustoVideoView customVideoView;
}
