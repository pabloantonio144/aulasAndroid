package com.example.laboratorio.ciclodevida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Exercicio10Tela1 extends AppCompatActivity {
    EditText numero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio10_tela1);
        numero = (EditText) findViewById(R.id.N1);
    }

    public void enviarFatorial(View view){
        int contador = 1;

        int fatorial = 1;
        String msg = "";
        int num = Integer.valueOf(numero.getText().toString());


        while (contador <= num){
            fatorial = fatorial * contador;
            contador++;
        }
        msg+="O Fatorial de " +num+ " é = " +fatorial;

        Intent i = new Intent(this, Exercicio10Tela2.class);
        i.putExtra("resultado", msg);
        startActivity(i);
    }
}
