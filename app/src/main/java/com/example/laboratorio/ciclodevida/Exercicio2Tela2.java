package com.example.laboratorio.ciclodevida;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Pablo on 21/03/2017.
 */
public class Exercicio2Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio2_tela2);

        String msg = getIntent().getStringExtra("resultado");
        TextView textResultado = (TextView) findViewById(R.id.textResultado);

        textResultado.setText(msg);
    }
}
