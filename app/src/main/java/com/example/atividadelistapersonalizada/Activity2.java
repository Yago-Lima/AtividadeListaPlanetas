package com.example.atividadelistapersonalizada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView nomePlaneta;
    ImageView imagemPlaneta;
    TextView descricao1;
    TextView descricao2;
    TextView descricao3;
    ImageView buttonVoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        nomePlaneta = findViewById(R.id.nomePlaneta);
        imagemPlaneta = findViewById(R.id.imagemPlaneta);
        descricao1 = findViewById(R.id.textViewCuriosidade1);
        descricao2 = findViewById(R.id.textViewCuriosidade2);
        descricao3 = findViewById(R.id.textViewCuriosidade3);
        buttonVoltar = findViewById(R.id.imageVoltar);

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Activity2.this, MainActivity.class);
                startActivity(it);
            }
        });

        Intent it = getIntent();
        String planeta = it.getStringExtra("planeta");

        if (planeta != null) {
            gerarConteudo(planeta);
        }
    }

    private void gerarConteudo(String planeta) {

        switch (planeta) {
            case "Mercurio":
                imagemPlaneta.setImageResource(R.drawable.mercurio);
                nomePlaneta.setText(R.string.Mercurio_titulo);
                descricao1.setText(R.string.Mercurio_descricao1);
                descricao2.setText(R.string.Mercurio_descricao2);
                descricao3.setText(R.string.Mercurio_descricao3);
                break;
            case "Venus":
                imagemPlaneta.setImageResource(R.drawable.venus);
                nomePlaneta.setText(R.string.Venus_titulo);
                descricao1.setText(R.string.Venus_descricao1);
                descricao2.setText(R.string.Venus_descricao2);
                descricao3.setText(R.string.Venus_descricao3);
                break;
            case "Terra":
                imagemPlaneta.setImageResource(R.drawable.terra);
                nomePlaneta.setText(R.string.Terra_titulo);
                descricao1.setText(R.string.Terra_descricao1);
                descricao2.setText(R.string.Terra_descricao2);
                descricao3.setText(R.string.Terra_descricao3);
                break;
            case "Marte":
                imagemPlaneta.setImageResource(R.drawable.marte);
                nomePlaneta.setText(R.string.Marte_titulo);
                descricao1.setText(R.string.Marte_descricao1);
                descricao2.setText(R.string.Marte_descricao2);
                descricao3.setText(R.string.Marte_descricao3);
                break;
            case "Jupiter":
                imagemPlaneta.setImageResource(R.drawable.jupiter);
                nomePlaneta.setText(R.string.Jupiter_titulo);
                descricao1.setText(R.string.Jupiter_descricao1);
                descricao2.setText(R.string.Jupiter_descricao2);
                descricao3.setText(R.string.Jupiter_descricao3);
                break;
            case "Saturno":
                imagemPlaneta.setImageResource(R.drawable.saturno);
                nomePlaneta.setText(R.string.Saturno_titulo);
                descricao1.setText(R.string.Saturno_descricao1);
                descricao2.setText(R.string.Saturno_descricao2);
                descricao3.setText(R.string.Saturno_descricao3);
                break;
            case "Urano":
                imagemPlaneta.setImageResource(R.drawable.urano);
                nomePlaneta.setText(R.string.Urano_titulo);
                descricao1.setText(R.string.Urano_descricao1);
                descricao2.setText(R.string.Urano_descricao2);
                descricao3.setText(R.string.Urano_descricao3);
                break;
            case "Netuno":
                imagemPlaneta.setImageResource(R.drawable.netuno);
                nomePlaneta.setText(R.string.Netuno_titulo);
                descricao1.setText(R.string.Netuno_descricao1);
                descricao2.setText(R.string.Netuno_descricao2);
                descricao3.setText(R.string.Netuno_descricao3);
                break;
            case "Plutao":
                imagemPlaneta.setImageResource(R.drawable.plutao);
                nomePlaneta.setText(R.string.Plutao_titulo);
                descricao1.setText(R.string.Plutao_descricao1);
                descricao2.setText(R.string.Plutao_descricao2);
                descricao3.setText(R.string.Plutao_descricao3);
                break;
        }
    }
}