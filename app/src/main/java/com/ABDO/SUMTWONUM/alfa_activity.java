package com.ABDO.SUMTWONUM;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class alfa_activity extends AppCompatActivity {

    double  result ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.alfa_layout);

        final EditText num_one = findViewById(R.id.alfa_et_NUMONE);
        final EditText num_two = findViewById(R.id.alfa_et_NUMTWO);
        Button   calc    = findViewById(R.id.alfa_bt_calc);
        final TextView res = findViewById(R.id.alfa_tv_result);


        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num_one1  =   num_one.getText().toString();
                String num_two2  = num_two.getText().toString();

                double one =Double.parseDouble(num_one1);
                double two = Double.parseDouble(num_two2);
                result = one + two ;
                res.setText(String.valueOf(result));

            }
        });





    }
}
