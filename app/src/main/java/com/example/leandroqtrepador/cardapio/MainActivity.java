package com.example.leandroqtrepador.cardapio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TITULO = "com.example.cardapio.MENSAGEMTITULO";
    public static final String ITEM1 = "com.example.cardapio.MENSAGEMITEM1";
    public static final String ITEM2 = "com.example.cardapio.MENSAGEMITEM2";
    public String tituloDaActivity;
    public String item1;
    public String item2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pratoQuente (View view){
        tituloDaActivity = "Pratos Quentes";
        item1 = "Macarrão";
        item2 = "Lazanha";
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra(TITULO, tituloDaActivity);
        intent.putExtra(ITEM1, item1);
        intent.putExtra(ITEM2, item2);
        startActivity(intent);
    }
    public void sobremesa (View view){
        tituloDaActivity = "Sobremesas";
        item1 = "Sorvete";
        item2 = "Açaí";
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra(TITULO, tituloDaActivity);
        intent.putExtra(ITEM1, item1);
        intent.putExtra(ITEM2, item2);
        startActivity(intent);
    }
    public void bebidas (View view){
        tituloDaActivity = "Bebidas";
        item1 = "Refrigerante";
        item2 = "Cerveja";
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra(TITULO, tituloDaActivity);
        intent.putExtra(ITEM1, item1);
        intent.putExtra(ITEM2, item2);
        startActivity(intent);
    }
    public void lanche (View view){
        tituloDaActivity = "Lanches";
        item1 = "X-Salada";
        item2 = "X-Egg";
        Intent intent = new Intent(this, SegundaActivity.class);
        intent.putExtra(TITULO, tituloDaActivity);
        intent.putExtra(ITEM1, item1);
        intent.putExtra(ITEM2, item2);
        startActivity(intent);
    }
}
