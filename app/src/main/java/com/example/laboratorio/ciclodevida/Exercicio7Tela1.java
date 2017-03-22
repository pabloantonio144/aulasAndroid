package com.example.laboratorio.ciclodevida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Exercicio7Tela1 extends AppCompatActivity {
    EditText num1,num2,num3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio7_tela1);
        num1 = (EditText) findViewById(R.id.edN1);
        num2 = (EditText) findViewById(R.id.edN2);
        num3 = (EditText) findViewById(R.id.edN3);
    }

    public void enviarNumeros(View view){
    String msg = "";
    int maior, meio, menor;

        int n1 = Integer.valueOf(num1.getText().toString());
        int n2 = Integer.valueOf(num2.getText().toString());
        int n3 = Integer.valueOf(num3.getText().toString());

    if(n2 > n1 && n2 > n3){
        maior = n2;
        msg+= maior;
    }
    if(n3 > n1 && n3 > n2){
        maior = n3;
        msg+= maior;
    }
    if(n2 < n1 && n2 < n3){
        menor = n2;
        msg+= menor;
    }
    if(n3 < n1 && n3 < n2){
        menor = n3;
        msg+= n3;
    }
        if(n1<n2 && n1>n3){
            msg+= n1;
        }
        if(n1>n2 && n1<n3){
            msg+= n1;
        }
        if(n2<n1 && n1>n3){
            msg+= n2;
        }
        if(n2>n1 && n1<n3){
            msg+= n3;
        }
        if(n3>n1 && n1<n2){
            msg+= n3;
        }
        if(n3<n1 && n1>n2){
            msg+= n3;
        }

        Intent i = new Intent(this, Exercicio7Tela2.class);
        i.putExtra("resultado", msg);
        startActivity(i);
    }
}
