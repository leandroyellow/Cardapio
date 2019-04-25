package com.example.leandroqtrepador.cardapio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.leandroqtrepador.cardapio.modelos.Produto;

public class SegundaActivity extends AppCompatActivity {

    public Produto produto1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent intent = getIntent();
        String titulo = intent.getStringExtra(MainActivity.TITULO);
        TextView textViewTitulo = findViewById(R.id.tvTitulo);
        TextView textViewitem1 = findViewById(R.id.tvItem1);
        TextView textViewDescr1 = findViewById(R.id.tvDescricao1);
        TextView textViewPreco1 = findViewById(R.id.tvPreco1);

        textViewTitulo.setText(titulo);

        if (titulo.equals("Pratos Quentes")){
            produto1 = new Produto("Lazanha", 12.99, "Pratos Quentes", "Bolonhesa");
            textViewitem1.setText(produto1.getNome());
            textViewDescr1.setText((produto1.getDescricao()));
            textViewPreco1.setText("R$" + produto1.getPreco().toString());
        }
        else if (titulo.equals("Sobremesas")){
            textViewitem1.setText("Sorvete");
        }
        else if (titulo.equals("Bebidas")){
            textViewitem1.setText("Refrigerante");
        }
        else if (titulo.equals("Lanches")){
            textViewitem1.setText("X-tudo");
        }

    }
}
