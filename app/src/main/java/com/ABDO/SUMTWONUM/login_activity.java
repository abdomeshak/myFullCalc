package com.ABDO.SUMTWONUM;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class login_activity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.login_layout);
        Button login    = findViewById(R.id.bt_login);
        Button regester = findViewById(R.id.bt_regester);
        EditText username = findViewById(R.id.et_username);
        EditText password = findViewById(R.id.et_password);



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }


}
