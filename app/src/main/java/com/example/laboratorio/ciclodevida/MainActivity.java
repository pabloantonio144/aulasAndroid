package com.example.laboratorio.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edCampo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edCampo = (EditText) findViewById(R.id.edCampo);
        edCampo.append("Estou no onCreate!\n");
        Log.i("ON CREATE","Estou no onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        edCampo.append("Agora estou no onResume!\n");
        Log.i("ON RESUME", "Agora estou no onResume!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        edCampo.append("Entrei em pausa!");
        Log.i("ON PAUSE", "Entrei em pausa!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        edCampo.append("Ops!, estou parado!");
        Log.i("ON STOP", "Ops!, estou parado!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        edCampo.append("No método onDestroy, #partiu!");
        Log.i("ON DESTROY", ":~( #partiu!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        edCampo.append("No método onRestart!!!!");
        Log.i("ON RESTART", "restartando...");
    }

    public void sair(View view){
        finish();
        edCampo.append("Saindo...");
        Log.i("SAINDO", "#saiu");
    }
}
