package com.example.laboratorio.ciclodevida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Exercicio16Tela1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio16_tela1);
    }

    public void enviar100Primos(View view){

        int n=0, d=1, cont=100;
        String msg = "";

        while (n<1000){
            while (d<=n){
                if (n%d==0)
                    cont++;
                d++;
            }

            if (cont==2)
                msg+= n+",";
            n++;d=1;cont=0;
        }
        Intent q = new Intent(this, Exercicio16Tela2.class);
        q.putExtra("resultado", msg);
        startActivity(q);

        }










    }



