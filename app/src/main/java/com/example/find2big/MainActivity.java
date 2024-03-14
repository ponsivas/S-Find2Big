package com.example.find2big;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText A,B,C;
    Button Cl,Re;
    TextView B1,B2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        A = (EditText) findViewById(R.id.N1);
        B = (EditText) findViewById(R.id.N2);
        C = (EditText) findViewById(R.id.N3);
        Cl = (Button) findViewById(R.id.CLR);
        Re = (Button) findViewById(R.id.RES);
        B1 = (TextView) findViewById(R.id.ANS1);
        B2 = (TextView) findViewById(R.id.ANS2);

        Cl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                A.setText("");
                B.setText("");
                C.setText("");
                B1.setText("");
                B2.setText("");
            }
        });

        Re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a, b, c;

               a = Integer.parseInt(A.getText().toString());
               b = Integer.parseInt(B.getText().toString());
               c = Integer.parseInt(C.getText().toString());

                if ((a < b) && (a < c)) {
                    if(b<c) {
                        B1.setText(Integer.toString(b));
                        B2.setText(Integer.toString(c));
                    }else {
                        B1.setText(Integer.toString(c));
                        B2.setText(Integer.toString(b));
                    }

                } else if ((b < a) && (b < c)) {
                if(a<c) {
                    B1.setText(Integer.toString(a));
                    B2.setText(Integer.toString(c));
                }else {
                    B1.setText(Integer.toString(c));
                    B2.setText(Integer.toString(a));
                }
                } else {
                if(a<b) {
                    B1.setText(Integer.toString(a));
                    B2.setText(Integer.toString(b));
                }else {
                    B1.setText(Integer.toString(b));
                    B2.setText(Integer.toString(a));
                }

                }
            }
        });
    }
}