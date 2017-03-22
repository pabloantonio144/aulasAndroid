package com.example.laboratorio.ciclodevida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Exercicio5Tela1 extends AppCompatActivity {
    EditText num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio5_tela1);
        num = (EditText) findViewById(R.id.edNum1);
    }

    public void enviarNumero(View view){
        String msg = "";
        int n = Integer.valueOf(num.getText().toString());

        if(n < 0){
            msg+= "O numero digitado e menor que zero";
        }else msg+= "O "+n+" multiplicado por 2 e: "+n*2;

        Intent i = new Intent(this, Exercicio5Tela2.class);
        i.putExtra("resultado", msg);
        startActivity(i);
    }
}
