package com.example.smartfarm;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  customVideoView=findViewById(R.id.VideoView);
        //customVideoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.drawable.));
    }
    private CustoVideoView customVideoView;
}
