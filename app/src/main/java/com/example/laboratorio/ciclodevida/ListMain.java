package com.example.laboratorio.ciclodevida;

import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.provider.Contacts;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListMain extends ListActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] values = new String[] {"Calculadora", "Principal", "MainActivity", "Exercicio 1", "Exercicio 2", "Exercicio 3",
                "Exercicio 4", "Exercicio 5", "Exercicio 6", "Exercicio 7", "Exercicio 8", "Exercicio 9", "Exercicio 10",
                "Exercicio 11", "Exercicio 12", "Exercicio 13", "Exercicio 14", "Exercicio 15", "Exercicio 16"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String item = (String) getListAdapter().getItem(position);
        Toast.makeText(this, item + " selected", Toast.LENGTH_SHORT).show();

        Intent i;
        switch (item){
            case "Calculadora":
                i = new Intent(this, Calculadora.class);
                startActivity(i);
                break;
            case "Principal":
                i = new Intent(this, Principal.class);
                startActivity(i);
                break;
            case "MainActivity":
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;
            case "Exercicio 1":
                i = new Intent(this, Exercicio1Tela1.class);
                startActivity(i);
                break;
            case "Exercicio 2":
                i = new Intent(this, Exercicio2Tela1.class);
                startActivity(i);
                break;
            case "Exercicio 3":
                i = new Intent(this, Exercicio3Tela1.class);
                startActivity(i);
                break;
            case "Exercicio 4":
                i = new Intent(this, Exercicio4Tela1.class);
                startActivity(i);
                break;
            case "Exercicio 5":
                i = new Intent(this, Exercicio5Tela1.class);
                startActivity(i);
                break;
            case "Exercicio 6":
                i = new Intent(this, Exercicio6Tela1.class);
                startActivity(i);
                break;
            case "Exercicio 7":
                i = new Intent(this, Exercicio7Tela1.class);
                startActivity(i);
                break;
            case "Exercicio 8":
                i = new Intent(this, Exercicio8Tela1.class);
                startActivity(i);
                break;
            case "Exercicio 9":
                i = new Intent(this, Exercicio9Tela1.class);
                startActivity(i);
                break;
            case "Exercicio 10":
                i = new Intent(this, Exercicio10Tela1.class);
                startActivity(i);
                break;
            case "Exercicio 11":
                i = new Intent(this, Exercicio11Tela1.class);
                startActivity(i);
                break;
            case "Exercicio 12":
                i = new Intent(this, Exercicio12Tela1.class);
                startActivity(i);
                break;
            case "Exercicio 13":
                i = new Intent(this, Exercicio13Tela1.class);
                startActivity(i);
                break;
            case "Exercicio 14":
                i = new Intent(this, Exercicio14Tela1.class);
                startActivity(i);
                break;
            case "Exercicio 15":
                i = new Intent(this, Exercicio15Tela1.class);
                startActivity(i);
                break;
            case "Exercicio 16":
                i = new Intent(this, Exercicio16Tela1.class);
                startActivity(i);
                break;


        }
    }


}
