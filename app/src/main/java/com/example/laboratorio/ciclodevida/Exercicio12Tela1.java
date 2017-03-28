package com.example.laboratorio.ciclodevida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Exercicio12Tela1 extends AppCompatActivity {
    EditText idade1, nome1 ,idade2, nome2 , idade3 , nome3 ,idade4 , nome4 , idade5 , nome5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio12_tela1);
        idade1 = (EditText) findViewById(R.id.ididade1);
        nome1 = (EditText) findViewById(R.id.idnome1);

        idade2 = (EditText) findViewById(R.id.ididade2);
        nome2 = (EditText) findViewById(R.id.idnome2);

        idade3 = (EditText) findViewById(R.id.ididade3);
        nome3 = (EditText) findViewById(R.id.idnome3);

        idade4 = (EditText) findViewById(R.id.ididade4);
        nome4 = (EditText) findViewById(R.id.idnome4);

        idade5 = (EditText) findViewById(R.id.ididade5);
        nome5 = (EditText) findViewById(R.id.idnome5);

    }
    public void enviarNomeidade(View view){
        String msg = "";
        int id1 = Integer.valueOf(idade1.getText().toString());
        String no1 = String.valueOf(nome1.getText().toString());

        int id2 = Integer.valueOf(idade2.getText().toString());
        String no2 = String.valueOf(nome2.getText().toString());

        int id3 = Integer.valueOf(idade3.getText().toString());
        String no3 = String.valueOf(nome3.getText().toString());

        int id4 = Integer.valueOf(idade4.getText().toString());
        String no4 = String.valueOf(nome4.getText().toString());

        int id5 = Integer.valueOf(idade5.getText().toString());
        String no5 = String.valueOf(nome5.getText().toString());

        int soma = 0 ;

        soma = (id1 + id2 + id3 + id4 + id5);




            msg+= "Soma da idades é "+soma ;
        if((id1 >= id2) && (id1 >= id3) && (id1 >= id4) && (id1 >= id5)){
            msg+= "Nome: "+no1;
        }
        if((id2 >= id1) && (id2 >= id3) && (id2 >= id4) && (id2 >= id5)){
            msg+= "Nome: "+no2;
        }
        if((id3 >= id1) && (id3 >= id2) && (id3 >= id4) && (id3 >= id5)){
            msg+= "Nome: "+no3;
        }
        if((id4 >= id1) && (id4 >= id2) && (id4 >= id3) && (id4 >= id5)){
            msg+= "Nome: "+no4;
        }
        if((id5 >= id1) && (id5 >= id2) && (id5 >= id3) && (id5 >= id4)){
            msg+= "Nome: "+no4;
        }

        Intent i = new Intent(this, Exercicio12Tela2.class);
        i.putExtra("resultado", msg);
        startActivity(i);
    }
}
