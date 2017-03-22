package com.example.laboratorio.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Exercicio3Tela1 extends AppCompatActivity {
    EditText nome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio3_tela1);
        nome = (EditText) findViewById(R.id.edPalavra);
    }
    public void enviarResposta(View view){

    }
}
