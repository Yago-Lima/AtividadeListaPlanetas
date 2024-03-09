package com.example.atividadelistapersonalizada;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;

import java.util.ArrayList;

public class Lista {

    private MyAdapter myAdapter;
    private ArrayList<ItemLista> lista;
    private Context context;


    public Lista(Context context) {
        this.context = context;
        criarList();
    }

    private void criarList() {
        lista = new ArrayList<ItemLista>();
        ItemLista item1 = new ItemLista(R.drawable.mercurio,"Mercurio");
        ItemLista item2 = new ItemLista(R.drawable.venus,"Venus");
        ItemLista item3 = new ItemLista(R.drawable.terra,"Terra");
        ItemLista item4 = new ItemLista(R.drawable.marte,"Marte");
        ItemLista item5 = new ItemLista(R.drawable.jupiter,"Jupiter");
        ItemLista item6 = new ItemLista(R.drawable.saturno,"Saturno");
        ItemLista item7 = new ItemLista(R.drawable.urano,"Urano");
        ItemLista item8 = new ItemLista(R.drawable.netuno,"Netuno");
        ItemLista item9 = new ItemLista(R.drawable.plutao,"Plutao");

        lista.add(item1);
        lista.add(item2);
        lista.add(item3);
        lista.add(item4);
        lista.add(item5);
        lista.add(item6);
        lista.add(item7);
        lista.add(item8);
        lista.add(item9);

        myAdapter = new MyAdapter(context, lista);
    }


    public MyAdapter getMyAdapter() {
        return myAdapter;
    }
}
