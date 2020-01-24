package com.example.geradorsena;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private Button btnClick;
    private TextView res;
    private EditText pegar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = (Button) findViewById(R.id.btn);
        res = (TextView) findViewById(R.id.tx1);
        pegar = (EditText) findViewById(R.id.pega);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random rd = new Random();


                Integer campoEditext = Integer.parseInt(pegar.getText().toString());


                if ( campoEditext < 6 || campoEditext > 15) {
                    String erro = "Digite um numero de 6 a 15 !!!";
                    res.setText(erro);

                    List<Integer> numeros = new ArrayList<>();
                    for (int i = 1; i <= 60; i++) {
                        numeros.add(i);

                    }

                } else{



                    List<Integer> numeros = new ArrayList<>();
                    for (int i = 1; i <= 60; i++) {
                        numeros.add(i);

                    }

                    Collections.shuffle(numeros);


                    String s1 = "";
                    for (int k = 0; k < campoEditext; k++) {

                        s1 += "( " +  + numeros.get(k) + " )"  ;

                    }

                    res.setText(s1);



                }


            }
        });



    }


}










