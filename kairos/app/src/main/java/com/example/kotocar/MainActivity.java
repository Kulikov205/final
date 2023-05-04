package com.example.kotocar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Запуск neiron
        ImageButton button = findViewById(R.id.neironka);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_LAUNCHER);
                intent.setComponent(new ComponentName("com.example.neironka", "com.example.neironka.MainActivity"));
                startActivity(intent);
            }
        });

    }

    public void openInfo(View v) {
        Intent intent = new Intent(this, info.class);
        startActivity(intent);
    }

    public void openSiz(View v) {
        Intent intent = new Intent(this, siz.class);
        startActivity(intent);
    }

    public void openDangerzone(View v) {
        Intent intent = new Intent(this, dangerzone.class);
        startActivity(intent);
    }

    public void openDetail(View v) {
        Intent intent = new Intent(this, detail.class);
        startActivity(intent);
    }

    public void openSortirovka(View v) {
        Intent intent = new Intent(this, sortirovka.class);
        startActivity(intent);
    }

    public void openFiltr(View v) {
        Intent intent = new Intent(this, filtr.class);
        startActivity(intent);
    }

    public void openKontrol(View v) {
        Intent intent = new Intent(this, kontrol.class);
        startActivity(intent);
    }

    public void openSborka(View v) {
        Intent intent = new Intent(this, sborka.class);
        startActivity(intent);
    }



}