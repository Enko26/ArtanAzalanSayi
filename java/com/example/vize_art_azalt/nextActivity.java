package com.example.vize_art_azalt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class nextActivity extends AppCompatActivity {
    int sayac=0;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        t=(TextView) findViewById(R.id.textCikti);
    }
   public void SayiArt(View v)
   {
       sayac++;
       t.setText(" "+sayac);
   }
    public void SayiAzalt(View v)
    {
        sayac--;
        t.setText(" "+sayac);
    }
}