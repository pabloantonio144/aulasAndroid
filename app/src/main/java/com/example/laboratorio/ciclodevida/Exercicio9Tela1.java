package com.example.laboratorio.ciclodevida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Exercicio9Tela1 extends AppCompatActivity {
    EditText n1,n2,n3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio9_tela1);
        n1 = (EditText) findViewById(R.id.Num01);
        n2 = (EditText) findViewById(R.id.Num02);
        n3 = (EditText) findViewById(R.id.Num03);
    }

    public void enviarOsNumeros(View view){
        int soma;
        String msg = "";
        int num1 = Integer.valueOf(n1.getText().toString());
        int num2 = Integer.valueOf(n2.getText().toString());
        int num3 = Integer.valueOf(n3.getText().toString());

        soma = num1+num2+num3;

        if (soma >= 10){
            msg+="SOMA DOS NUMEROS E MAIOR QUE 10";
        }
        if (soma<10 && soma>0 ){
            msg+="SOMA DOS NUMEROS E MENOR QUE 10";
        }
        if (soma<0){
            msg+="SOMA DOS NUMEROS DEU NEGATIVO";
        }

        Intent i = new Intent(this, Exercicio9Tela2.class);
        i.putExtra("resultado", msg);
        startActivity(i);
    }
}
