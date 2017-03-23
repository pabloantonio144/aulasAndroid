package com.example.laboratorio.ciclodevida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Exercicio8Tela1 extends AppCompatActivity {
    EditText palavra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio8_tela1);
        palavra = (EditText) findViewById(R.id.edPalavras);
    }

    public void enviarPesquisa(View view){
        String msg = "";
        String pal = String.valueOf(palavra.getText().toString());

        if(pal.charAt(0) =='a'){
            msg+= pal;
        }else msg+= "A palavra não começa com a letra A";

        Intent i = new Intent(this, Exercicio8Tela2.class);
        i.putExtra("resultado", msg);
        startActivity(i);
    }
}
