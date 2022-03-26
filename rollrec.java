package com.example.madmp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class rollrec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rollrec);
        VideoView video=findViewById(R.id.v1);
        String videopath="android.resource://"+getPackageName()+"/"+R.raw.rollvedio;
        Uri uri= Uri.parse(videopath);
        video.setVideoURI(uri);

        MediaController m=new MediaController(this);
        video.setMediaController(m);
        m.setAnchorView(video);
    }
}
