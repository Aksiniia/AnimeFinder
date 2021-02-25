package com.example.animefinder;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        EditText signInEmail = findViewById(R.id.signInEmail);
        EditText signInPassword = findViewById(R.id.signInPassword);

        findViewById(R.id.signInToSignUp).
                setOnClickListener(v -> {
                    String email = signInEmail.getText().toString();
                    String password = signInPassword.getText().toString();

                    if (email.length() == 0)
                        signInEmail.setError("Введите Email");

                    else if (!email.contains("@"))
                        signInEmail.setError("Введите корректный Email");

                    else if (password.length() == 0)
                        signInPassword.setError("Введите пароль");

                    else
                        startActivity(
                                new Intent(SignInActivity.this,
                                        MainActivity.class
                                ));
                });

        findViewById(R.id.toSignUp).
                setOnClickListener(v -> {
                    startActivity(
                            new Intent(SignInActivity.this,
                                    SignUpActivity.class
                            ));
                });
    }
}