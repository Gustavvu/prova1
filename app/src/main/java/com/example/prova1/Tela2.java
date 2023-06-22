package com.example.prova1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {
    TextView textViewPedido;
    TextView textViewVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        textViewPedido = findViewById(R.id.textView7);
        textViewVoltar = findViewById(R.id.textView9);


        textViewPedido.setText(getIntent().getStringExtra("Pedido"));
        textViewVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }
}