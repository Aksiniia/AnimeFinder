package com.example.animefinder;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        EditText signUpEmail = findViewById(R.id.signUpEmail);
        EditText signUpPassword = findViewById(R.id.signUpPassword);
        EditText signUpName = findViewById(R.id.signUpName);
        EditText signUpRepeatPassword = findViewById(R.id.signUpRepeatPassword);


        findViewById(R.id.signUpToMain).
                setOnClickListener(v -> {
                    String email = signUpEmail.getText().toString();
                    String password = signUpPassword.getText().toString();
                    String name = signUpName.getText().toString();

                    if (name.length() == 0)
                        signUpName.setError("Введите Name");

                    else if (email.length() == 0)
                        signUpEmail.setError("Введите Email");

                    else if (!email.contains("@"))
                        signUpEmail.setError("Введите корректный Email");

                    else if (password.length() == 0)
                        signUpPassword.setError("Введите пароль");

                    else if (password.length() == 0)
                        signUpRepeatPassword.setError("Пароли не совпадают");

                    else
                        startActivity(
                                new Intent(SignUpActivity.this,
                                        MainActivity.class
                                ));
                });

        findViewById(R.id.toSignIn).
                setOnClickListener(v -> {
                    startActivity(
                            new Intent(SignUpActivity.this,
                                    SignInActivity.class
                            ));
                });
    }
}