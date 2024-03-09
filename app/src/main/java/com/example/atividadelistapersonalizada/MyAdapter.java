package com.example.atividadelistapersonalizada;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private ArrayList<ItemLista> itens;

    public MyAdapter(Context context, ArrayList<ItemLista> itens) {
        this.itens = itens;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return itens.size();
    }

    @Override
    public Object getItem(int position) {
        return itens.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ItemLista item = itens.get(position);
        convertView = inflater.inflate(R.layout.item_lista, null);
        TextView texto = convertView.findViewById(R.id.texto);
        texto.setText(item.getInfo());
        ImageView imagem = convertView.findViewById(R.id.imagem);
        imagem.setImageResource(item.getImage());
        return convertView;
    }
}
