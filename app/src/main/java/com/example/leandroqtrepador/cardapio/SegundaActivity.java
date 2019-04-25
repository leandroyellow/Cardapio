package com.example.leandroqtrepador.cardapio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent intent = getIntent();
        String titulo = intent.getStringExtra(MainActivity.TITULO);
        String item1 = intent.getStringExtra(MainActivity.ITEM1);
        String item2 = intent.getStringExtra(MainActivity.ITEM2);
        TextView textViewTitulo = findViewById(R.id.tvTitulo);
        TextView textViewitem1 = findViewById(R.id.tvItem1);
        TextView textViewitem2 = findViewById(R.id.tvItem2);
        textViewTitulo.setText(titulo);
        textViewitem1.setText(item1);
        textViewitem2.setText(item2);

    }
}
