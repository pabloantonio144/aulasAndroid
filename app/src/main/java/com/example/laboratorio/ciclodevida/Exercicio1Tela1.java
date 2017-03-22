package com.example.laboratorio.ciclodevida;

import android.content.Intent;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Exercicio1Tela1 extends AppCompatActivity {
    EditText numero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio1_tela1);
        numero = (EditText) findViewById(R.id.edNumero);
    }

    public void enviarDados(View view){
        int n = Integer.valueOf(numero.getText().toString());

        String msg = "Antecessor: "+ (n-1) +
                "Sucessor: "+(n + 1) +
                "Quadrado: "+ (n * n)+
                "Raiz Quadrada" + (Math.sqrt(n));

        if((n * n) > 50)
            msg += "O quadrado e maior que 50";

        Intent i = new Intent(this, Exercicio1Tela2.class);
        i.putExtra("resultado", msg);
        startActivity(i);

    }
}
