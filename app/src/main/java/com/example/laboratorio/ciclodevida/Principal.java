package com.example.laboratorio.ciclodevida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void irParaCicloDeVida(View view){
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
    }

    public void irParaCalculadora(View view){
        Intent intent = new Intent(this, Calculadora.class);

        intent.putExtra("TextoCalcular", "Olá Calculadora!");

        startActivity(intent);
    }
}
