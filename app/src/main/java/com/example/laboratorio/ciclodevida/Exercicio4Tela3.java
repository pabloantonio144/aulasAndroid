package com.example.laboratorio.ciclodevida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Exercicio4Tela3 extends AppCompatActivity {
    EditText exame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio4_tela3);
        exame = (EditText) findViewById(R.id.edNotaExame);
    }

    public void notaExame(View view){
        String msg= "";
        int nota = Integer.valueOf(exame.getText().toString());

        if(nota < 6){
            msg+= "Reprovado";
        }else msg+= "Aprovado";

        Intent i = new Intent(this, Exercicio4Tela2.class);
        i.putExtra("resultado", msg);
        startActivity(i);

    }
}
