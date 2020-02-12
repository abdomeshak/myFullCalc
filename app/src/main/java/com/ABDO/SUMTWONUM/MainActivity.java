package com.ABDO.SUMTWONUM;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
       Button bt_intent = findViewById(R.id.bt_intent);
        TextView A = findViewById(R.id.main_activity_tv);



       bt_intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent one = new Intent(getBaseContext(),alfa_activity.class);
                startActivity(one);


            }
        });



    }

}
