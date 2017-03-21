package com.example.laboratorio.ciclodevida;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Pablo on 21/03/2017.
 */
public class Exercicio2Tela1 extends AppCompatActivity {
    EditText nome;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio2_tela1);
        nome = (EditText) findViewById(R.id.edNome);
    }

    public void enviarResposta(View view) {

        String n = String.valueOf(nome.toString());
       String msg = "A primeira letra e: " + n.charAt(0)+ "Ultima letra e: " + n.charAt(nome.length()-1);

        if((nome.length() < 5))
            msg += "Informe uma palavra maior que 5 letras";

        Intent i = new Intent(this, Exercicio2Tela2.class);
        i.putExtra("resultado", msg);
        startActivity(i);



    }
}