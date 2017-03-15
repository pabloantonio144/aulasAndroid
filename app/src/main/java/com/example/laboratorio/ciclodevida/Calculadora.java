package com.example.laboratorio.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Calculadora extends AppCompatActivity {

    int v1=0, v2 =0;
    EditText n1, n2;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        n1 = (EditText) findViewById(R.id.edN1);
        n2 = (EditText) findViewById(R.id.edN2);
        resultado = (TextView) findViewById(R.id.resultado);

    }

    public void somar(View view){
        v1 = Integer.valueOf(n1.getText().toString());
        v2 = Integer.valueOf(n2.getText().toString());
        resultado.setText(""+MathCalculadora.somar(v1, v2));
    }
    public void subtrair(View view){
        v1 = Integer.valueOf(n1.getText().toString());
        v2 = Integer.valueOf(n2.getText().toString());
        resultado.setText(""+MathCalculadora.subtrair(v1, v2));
    }
    public void multiplicar(View view){
        v1 = Integer.valueOf(n1.getText().toString());
        v2 = Integer.valueOf(n2.getText().toString());
        resultado.setText(""+MathCalculadora.multiplicar(v1, v2));
    }
    public void dividir(View view){
        v1 = Integer.valueOf(n1.getText().toString());
        v2 = Integer.valueOf(n2.getText().toString());
        resultado.setText(""+MathCalculadora.dividir(v1, v2));
    }


}
