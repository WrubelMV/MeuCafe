package com.example.meucafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quantidade = 0;
    int valor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addCafe (View view) {
        valor = 2;
        quantidade = 1;
        TextView quant = findViewById(R.id.textViewCont);
        quant.setText(quantidade++);
        TextView valorTotal = findViewById(R.id.textViewValorTotal);
        valorTotal.setText(valor++);

    }

    public void addCafeComLeite (View view) {
        valor = 3;
        quantidade = 1;
        TextView quant = findViewById(R.id.textViewCont);
        quant.setText(quantidade++);
        TextView valorTotal = findViewById(R.id.textViewValorTotal);
        valorTotal.setText(valor++);

    }

    public void addCapuccino (View view) {
        valor = 3;
        quantidade = 1;
        TextView quant = findViewById(R.id.textViewCont);
        quant.setText(quantidade++);
        TextView valorTotal = findViewById(R.id.textViewValorTotal);
        valorTotal.setText(valor++);

    }

    public String textViewPedido (int a, int b){
        int preco = b*quantidade;

        if (a == 1) {
            return "O valor final será: R$" + preco + "pelo seu café";
        }
        else {
            return "Seu pedido irá custar: R$" + preco + "pelos seus cafés desejados";
        }

    }
}
