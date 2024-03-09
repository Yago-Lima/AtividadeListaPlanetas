package com.example.atividadelistapersonalizada;

import static androidx.core.content.ContextCompat.startActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemClickListener, View.OnLongClickListener {
    private ListView listView;
    Lista lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.lista);
        lista = new Lista(this);
        listView.setAdapter(lista.getMyAdapter());
        listView.setOnItemClickListener(this);

    }
    public void abrirActivity(String itemSelecionado) {
        Intent it = null;
        switch (itemSelecionado) {
            case "Mercurio":
            case "Venus":
            case "Terra":
            case "Marte":
            case "Jupiter":
            case "Saturno":
            case "Urano":
            case "Netuno":
            case "Plutao":
                it = new Intent(this, Activity2.class);
                it.putExtra("planeta",itemSelecionado);
                startActivity(it);
                break;
        }//switch
    }//abrirActivity

    @Override
    public boolean onLongClick(View v) {
        return false;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String itemSelecionado = parent.getItemAtPosition(position).toString();
        abrirActivity(itemSelecionado);
    }
}