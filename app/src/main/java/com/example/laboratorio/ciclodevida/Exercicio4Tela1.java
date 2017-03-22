package com.example.laboratorio.ciclodevida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Exercicio4Tela1 extends AppCompatActivity {
    EditText nota;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio4_tela1);
        nota = (EditText) findViewById(R.id.edNota);
    }

    public void enviarNota(View view){
        String msg = "";
        int n = Integer.valueOf(nota.getText().toString());

        if(n < 7){
            msg+= "Nota do exame";

        }else msg+= "Aprovado sem a necessidade de exame";

        Intent i = new Intent(this, Exercicio4Tela2.class);
        i.putExtra("resultado", msg);
        startActivity(i);

    }
}
