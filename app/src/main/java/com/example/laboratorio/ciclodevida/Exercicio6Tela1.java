package com.example.laboratorio.ciclodevida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Exercicio6Tela1 extends AppCompatActivity {
    EditText num;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio6_tela1);
        num = (EditText) findViewById(R.id.edNum);


    }

    public void enviarResposta(View view) {
        int n = Integer.valueOf(num.getText().toString());

        String msg = "";
        if (n > 10){
            msg+="O " +n+" multiplicado por 2 e: " +n*2;

              }else msg+=" O "+n+" multiplicado por 3 e: "+n*3;

            Intent i = new Intent(this, Exercicio6Tela2.class);
            i.putExtra("resultado", msg);
            startActivity(i);
        }
    }


