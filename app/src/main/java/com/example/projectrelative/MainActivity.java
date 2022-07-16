package com.example.projectrelative;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


    }

    public void pindah(View view) {
       Intent Intent = new Intent(MainActivity.this ,LoginActivity.class);
       startActivity(Intent);
    }

    public void daftar(View view) {
        Intent Intent = new Intent(MainActivity.this ,RegistrasiActivity.class);
        startActivity(Intent);
    }
}
