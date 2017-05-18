package com.example.monts.platzigram;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.monts.platzigram.view.ContainerActivity;
import com.example.monts.platzigram.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void goCreateAccount(View view){
        Intent intent=new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }
    public void goContainerActivity(View view) {
        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);

    }
    public void linkimagen(View view) {
        Intent newIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://platzi.com/"));
        startActivity(newIntent);
    }
}