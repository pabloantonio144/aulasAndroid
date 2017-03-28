package com.example.laboratorio.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Exercicio11Tela1 extends AppCompatActivity {
    EditText num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio11_tela1);
        num1 = (EditText) findViewById(R.id.edPNum);
        num2 = (EditText) findViewById(R.id.edSNum);
    }


}
