package com.example.animefinder;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
    }

    public void signInToSignUp(android.view.View v) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void toSignUp(android.view.View v) {
        startActivity(new Intent(this, SignUpActivity.class));
    }
}