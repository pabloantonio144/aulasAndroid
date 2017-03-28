package com.example.laboratorio.ciclodevida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Exercicio15Tela1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio15_tela1);
    }

    public void enviarTotalPrimos(View view){
        int n=0, d=1, cont=0;
    String msg = "";

        while (n<100){
            while (d<=n){
                if (n%d==0)
                    cont++;
                d++;
            }

            if (cont==2)
                msg+= n;
            n++;d=1;cont=0;
            }


            Intent i = new Intent(this, Exercicio15Tela2.class);
            i.putExtra("resultado", msg);
            startActivity(i);

        }
    }

