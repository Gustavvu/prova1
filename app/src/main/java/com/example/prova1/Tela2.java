package com.example.prova1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {
    TextView textViewPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        textViewPedido = findViewById(R.id.textView7);


    }
}