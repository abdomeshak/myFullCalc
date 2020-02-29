package com.ABDO.SUMTWONUM;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class full_calc_activity extends AppCompatActivity {
    EditText all ;
    char opreation ;
    double result ;
    String  num1 ;
    String  num2 ;

     void ope (char x )

    {
        num1    =all.getText().toString();
        all.setText("  ");
        opreation = x;
    }

    void num (String val )
    {
        String s = all.getText().toString() + val ;
        all.setText(s)  ;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_calc);
        Button zero=  findViewById(R.id.btn_0);
        Button one=  findViewById(R.id.btn_1);
        Button two=  findViewById(R.id.btn_2);
        Button three=  findViewById(R.id.btn_3);
        Button four=  findViewById(R.id.btn_4);
        Button five=  findViewById(R.id.btn_5);
        Button six=  findViewById(R.id.btn_6);
        Button seven=  findViewById(R.id.btn_7);
        Button eight=  findViewById(R.id.btn_8);
        Button nine=  findViewById(R.id.btn_9);
        Button mins=  findViewById(R.id.btn_mins);
        Button mins_mins=  findViewById(R.id.btn_mins_mins);
        Button mult=  findViewById(R.id.btn_mult);
        Button div=  findViewById(R.id.btn_div);
        Button dot=  findViewById(R.id.btn_dot);
        Button clear=  findViewById(R.id.btn_clear);
        Button pls=  findViewById(R.id.btn_pls);
        Button equal=  findViewById(R.id.btn_equal);
        Button exit=  findViewById(R.id.btn_exit);
        all = findViewById(R.id.et_res);



try {
    pls.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ope('+');
        }
    });
    mins.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ope('-');
        }
    });
    mult.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ope('*');
        }
    });
    div.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ope('/');
        }
    });
    dot.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            all.setText(".");
        }
    });
} catch (Exception e) {
    e.printStackTrace();
}

try {


    zero.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            num("0");


        }
    });
    one.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            num("1");


        }
    });
    two.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            num("2");


        }
    });
    three.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            num("3");


        }
    });
    four.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            num("4");


        }
    });
    five.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            num("5");


        }
    });
    six.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            num("6");


        }
    });
    seven.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            num("7");


        }
    });
    eight.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            num("8");


        }
    });
    nine.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            num("9");


        }
    });
    clear.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            all.setText(" ");


        }
    });
    exit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            System.exit(0);

        }
    });
    equal.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {

                                     num2 = all.getText().toString();
                                     switch (opreation) {
                                         case '+':
                                             result = Double.parseDouble(num1 )+ Double.parseDouble(num2);
                                             break;
                                         case '-':
                                             result =  Double.parseDouble(num1 )- Double.parseDouble(num2);
                                             break;
                                         case '*':
                                             result =  Double.parseDouble(num1 )* Double.parseDouble(num2);
                                             break;
                                         case '/':
                                             result =  Double.parseDouble(num1 )/ Double.parseDouble(num2);
                                             break;
                                     }
                                     all.setText(String.valueOf(result));
                                 }


                             }
    );

    mins_mins.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String num1 = String.valueOf(-1 * Double.parseDouble(all.getText().toString()));

            String xx = String.valueOf(num1);
            all.setText(xx);



        }
    });
} catch (Exception e) {
    e.printStackTrace();
}

    }
}
