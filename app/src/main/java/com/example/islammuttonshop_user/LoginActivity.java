package com.example.islammuttonshop_user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    TextInputEditText etLoginUsername, etLoginPassword;
    Button btnCancel, btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etLoginUsername.getText().toString().trim();
                String password = etLoginPassword.getText().toString();
                if(!name.isEmpty() && !password.isEmpty())
                {
                    if(name.equals("waqas") && password.equals("ali"))
                    {
                        SharedPreferences sPref = getApplicationContext()
                                .getSharedPreferences(MainActivity.FILENAME, MODE_PRIVATE);
                        SharedPreferences.Editor editor = sPref.edit();
                        editor.putString(MainActivity.NAME_KEY, name);
                        editor.commit();

                        Intent intent = new Intent(LoginActivity.this,
                                HomeActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
                else
                {
                    Toast.makeText(LoginActivity.this, "Username or " +
                            "password cant be empty", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void init()
    {

        etLoginPassword = findViewById(R.id.etLoginPassword);
        btnLogin = findViewById(R.id.btnLogin);
    }
}