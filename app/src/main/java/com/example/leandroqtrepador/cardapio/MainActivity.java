package com.example.leandroqtrepador.cardapio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TITULO = "com.example.cardapio.MENSAGEMTITULO";
    public String tituloDaActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pratoQuente (View view){
        tituloDaActivity = "Pratos Quentes";
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra(TITULO, tituloDaActivity);
        startActivity(intent);
    }
    public void sobremesa (View view){
        tituloDaActivity = "Sobremesas";
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra(TITULO, tituloDaActivity);
        startActivity(intent);
    }
    public void bebidas (View view){
        tituloDaActivity = "Bebidas";
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra(TITULO, tituloDaActivity);
        startActivity(intent);
    }
    public void lanche (View view){
        tituloDaActivity = "Lanches";
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra(TITULO, tituloDaActivity);
        startActivity(intent);
    }
}
