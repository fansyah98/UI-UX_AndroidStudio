package com.example.projectrelative;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistrasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);
        getSupportActionBar().hide();


    }

    public void back2(View view) {
        Intent Intent = new Intent(RegistrasiActivity.this ,LoginActivity.class);
        startActivity(Intent);
    }

    public void login(View view) {
        Intent Intent = new Intent(RegistrasiActivity.this ,LoginActivity.class);
        startActivity(Intent);
    }
}