package com.example.kotocar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class siz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siz);

        VideoView videoView = findViewById(R.id.siz);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.kaska);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();

        VideoView videoView2 = findViewById(R.id.videoView3);
        videoView2.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.wrench);

        MediaController mediaController2 = new MediaController(this);
        mediaController.setAnchorView(videoView2);
        videoView2.setMediaController(mediaController);
        videoView2.start();
    }
}

