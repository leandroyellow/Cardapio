package com.example.leandroqtrepador.cardapio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.leandroqtrepador.cardapio.modelos.Produto;

import java.util.ArrayList;

public class SegundaActivity extends AppCompatActivity {

    public ArrayList<Produto> produtos = new ArrayList<>();
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent intent = getIntent();
        String titulo = intent.getStringExtra(MainActivity.TITULO);
        TextView textViewTitulo = findViewById(R.id.tvTitulo);


        textViewTitulo.setText(titulo);

        if (titulo.equals("Pratos Quentes")) {
            produtos.add(new Produto("Lazanha", 12.99, "Prato Quente", "Bolonhesa"));
            produtos.add(new Produto("Pizza", 18.77, "Prato Quente", "Pizza mussarela"));
            produtos.add(new Produto("Arroz com feijão", 30.50, "Prato Quente", "com batata"));

        }
        else if (titulo.equals("Sobremesas")){
            produtos.add( new Produto("Sorvete", 5.00, "Sobremesa", "Massa"));
            produtos.add(new Produto("Sorvete", 3.50, "Sobremesa", "no palito"));

        }
        else if (titulo.equals("Bebidas")){
            produtos.add( new Produto("Refrigerante", 3.00, "Bebida", "Lata de 50 ml"));
            produtos.add(new Produto("Refrigerante", 30.50, "Bebida", "Lata de 100ml"));

        }
        else if (titulo.equals("Lanches")){
            produtos.add(new Produto("X-Picanha", 30.50, "Lanche", "Picanha com ovo"));
            produtos.add(new Produto("X-Egg", 32.50, "Lanche", "com ovo"));
            produtos.add(new Produto("X-Salada", 20.50, "Lanche", "com Salada"));
            produtos.add(new Produto("X-Burger", 25.50, "Lanche", "com hamburguer"));

        }
        listaProdutos(produtos);

    }

    public void listaProdutos(ArrayList<Produto> lista){

        linearLayout =  findViewById(R.id.lVertical);

        for (int i = 0; i < lista.size(); i++) {

            TextView textViewitem1 = new TextView(this);
            TextView textViewDescr1 = new TextView(this);
            TextView textViewPreco1 = new TextView(this);

            textViewitem1.setText(lista.get(i).getNome());
            textViewitem1.setTextSize(24);
            textViewDescr1.setText((lista.get(i).getDescricao()));
            textViewPreco1.setText("R$" + lista.get(i).getPreco().toString());

            linearLayout.addView(textViewitem1);
            linearLayout.addView(textViewDescr1);
            linearLayout.addView(textViewPreco1);

        }
    }

}
