package com.subayu.studio.login;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText username,password;
    Button login;
    LinearLayout panel;
    final String user = "admin";
    final String pass = "pass";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        panel = (LinearLayout)findViewById(R.id.panel);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        login = (Button)findViewById(R.id.btnLogin);

        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(username.getText().toString().equals(user) && password.getText().toString().equals(pass)){
            Intent intent = new Intent(MainActivity.this,Sukses.class);
            startActivity(intent);
        }else {
            final  Snackbar snackbar = Snackbar.make(panel,"Username atau Password Salah",Snackbar.LENGTH_INDEFINITE);
            snackbar.setAction("Tutup", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            snackbar.dismiss();
                        }
                    });
            snackbar.show();
        }
    }
}
