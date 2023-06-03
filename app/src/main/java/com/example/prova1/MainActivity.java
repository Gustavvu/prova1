package com.example.prova1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    EditText editTextPessoas;

    CheckBox checkBoxFrango, checkBoxFeijoada, checkBoxCarnecomBaiao;
    CheckBox checkBoxVinho, checkBoxDolly;

    RadioButton radioButton1, radioButton2, radioButton3;

    FloatingActionButton floatingActionButton;

    TextView tvrecibo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextPessoas=findViewById(R.id.editTextPessoas);

        checkBoxFrango=findViewById(R.id.checkBoxFrango);
        checkBoxFeijoada=findViewById(R.id.checkBoxFeijoada);
        checkBoxCarnecomBaiao=findViewById(R.id.checkBoxCarneComBaiao);
        tvrecibo=findViewById(R.id.textView8);

        checkBoxVinho=findViewById(R.id.checkBoxVinho);
        checkBoxDolly=findViewById(R.id.checkBoxDolly);

        radioButton1=findViewById(R.id.radioButton1);
        radioButton2=findViewById(R.id.radioButton2);
        radioButton3=findViewById(R.id.radioButton3);

        floatingActionButton=findViewById(R.id.floatingActionButton);



        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int frango = 10;
                int feijoada = 15;
                int carne = 20;

                int vinho = 10;
                int dolly = 4;

                int total = 0;
                String pratos = "";
                if (checkBoxFrango.isChecked()){
                    pratos = pratos + checkBoxFrango.getText().toString()+" | ";
                    total = total + frango;
                }
                if (checkBoxFeijoada.isChecked()){
                    pratos =  pratos + checkBoxFeijoada.getText().toString()+" | ";
                    total = total + feijoada;
                }
                if (checkBoxCarnecomBaiao.isChecked()){
                    pratos =  pratos + checkBoxCarnecomBaiao.getText().toString()+" | ";
                    total = total + carne;
                }

                String bebidas = "";
                if (checkBoxVinho.isChecked()){
                    bebidas = bebidas + checkBoxVinho.getText().toString();
                    total = total + vinho;
                }

                String pagamento = "";
                if (radioButton1.isChecked()){
                    pagamento = radioButton1.getText().toString();
                } else if (radioButton2.isChecked()) {
                    pagamento = radioButton2.getText().toString();
                } else if (radioButton3.isChecked()) {
                    pagamento = radioButton3.getText().toString();
                }

                String peoples = editTextPessoas.getText().toString();
                int pessoas = Integer.parseInt(peoples);
                total = total * pessoas;
                String recibo = "Seu Pedido\n"+"Clientes: "+editTextPessoas.getText().toString()+
                        "\nPratos: "+pratos+
                        "\nBebidas: "+bebidas+
                        "\nForma de Pagemento: "+pagamento+
                        "\nValor total: R$"+total;

                //Toast.makeText(MainActivity.this, recibo, Toast.LENGTH_SHORT).show();
                tvrecibo.setText(recibo);
                //startActivity(new Intent(view.getContext(), Tela2.class));
            }
        });
        checkBoxDolly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "EM FALTA NO ESTOQUE", Toast.LENGTH_SHORT).show();
                checkBoxDolly.setChecked(false);
            }
        });
    }
}