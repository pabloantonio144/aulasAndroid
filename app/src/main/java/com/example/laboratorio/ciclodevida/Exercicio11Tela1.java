package com.example.laboratorio.ciclodevida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Exercicio11Tela1 extends AppCompatActivity {
    EditText num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio11_tela1);
        num1 = (EditText) findViewById(R.id.edPNum);
        num2 = (EditText) findViewById(R.id.edSNum);
    }

    public void enviarNumero(View view){
        String msg = "";
        Intent j;
        int numero1 = Integer.valueOf(num1.getText().toString());
        int numero2 = Integer.valueOf(num2.getText().toString());

        int soma = 0;

        if(numero1 > numero2){
            msg+="Digite novamente ";
        }
        if(numero2 > numero1) {
            soma = (numero1 + numero2) * ((numero2 - numero1 + 1) / 2);


            msg += "a soma de todos numero entre " + numero1 + " e " + numero2 + " é " + soma;
        }
        Intent i = new Intent(this, Exercicio11Tela2.class);
        i.putExtra("resultado", msg);
        startActivity(i);
    }
}
