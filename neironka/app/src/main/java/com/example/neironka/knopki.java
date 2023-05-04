package com.example.neironka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class knopki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knopki);
    }
    public void Kontur(View v){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Kulikov205/Kontur"));
        startActivity(browserIntent);
    }public void CameraCV(View v){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Kulikov205/camera"));
        startActivity(browserIntent);
    }public void FotoCV(View v){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Kulikov205/foto"));
        startActivity(browserIntent);
    }public void Wrenches(View v){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Vagabong328/wrenches"));
        startActivity(browserIntent);
    }public void Color(View v){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Vagabong328/Color"));
        startActivity(browserIntent);
    }public void dozo(View v){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://colab.research.google.com/drive/1b4t_dxL7EHFeFrK1FrD1bCS56FyWnPL4?usp=sharing"));
        startActivity(browserIntent);
    }public void vaga(View v){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://colab.research.google.com/drive/1Y-ir-2P2V7A1DUTIDCkafiQJ_-sK1qQ3?usp=sharing"));
        startActivity(browserIntent);
    }public void pickle(View v){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://colab.research.google.com/drive/1yu0K4SCykcqPeC_-dtuPk_Uorzu613Or?usp=sharing"));
        startActivity(browserIntent);
    }public void olman(View v){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://colab.research.google.com/drive/10fcKWS5Amcau0gj3InIeZLouWP-9AK6c#scrollTo=vM54r6jlKTII"));
        startActivity(browserIntent);
    }public void kairos(View v){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://colab.research.google.com/drive/1W3CXVnCuCYQFOqDudDY7tcifz67tDoBq?usp=sharing"));
        startActivity(browserIntent);
    }public void size(View v){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://colab.research.google.com/drive/1zy2O4CF9xDsIl3LIo8qBxgwbSb6eSWFY?usp=sharing"));
        startActivity(browserIntent);
    }public void detail(View v){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://colab.research.google.com/drive/1VplROXdLB19C3Tw31Ki6wSp8Qd3N1FCy?usp=sharing"));
        startActivity(browserIntent);
    }public void rubble(View v){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://colab.research.google.com/drive/1euMri7kPGLl7AlCkXOUhSX3JBo4F7iVC?usp=sharing"));
        startActivity(browserIntent);

    }public void UMK(View v){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://colab.research.google.com/drive/1Ndd1s0lNQqUfpSBpF0SYX9vT-YEvkHXG?usp=sharing"));
        startActivity(browserIntent);
    }
}