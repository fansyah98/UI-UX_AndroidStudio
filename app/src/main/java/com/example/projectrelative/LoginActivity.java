package com.example.projectrelative;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
    }

    public void back(View view) {
        Intent Intent = new Intent(LoginActivity.this ,MainActivity.class);
        startActivity(Intent);
    }

    public void regis(View view) {
        Intent Intent = new Intent(LoginActivity.this ,RegistrasiActivity.class);
        startActivity(Intent);
    }
}