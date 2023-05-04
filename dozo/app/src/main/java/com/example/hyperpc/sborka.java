package com.example.hyperpc;

import static android.widget.Toast.LENGTH_SHORT;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class sborka extends AppCompatActivity {
    //com.gamma.scan
    //com.gamma.barcodeapp.ui.BarcodeCaptureActivity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sborka);

        VideoView videoView = findViewById(R.id.qr);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.qr);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();

        ImageButton button = findViewById(R.id.sborka);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_LAUNCHER);
                intent.setComponent(new ComponentName("com.gamma.scan", "com.gamma.barcodeapp.ui.BarcodeCaptureActivity"));
                startActivity(intent);
            }
        });



    }
}