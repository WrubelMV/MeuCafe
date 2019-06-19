package com.example.meucafe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quantidade = 0;
    int valor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.buttonFazerPedido);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent sendEmail = new Intent(Intent.ACTION_SEND);

                // Tipo do conteúdo.
                sendEmail.setType("text/plain");

                // Para passar os destinatários deve-se utilizar um array com
                // os endreços de e-mails.
                String[] addresses = {"hewerton.oliveira@ifc.edu.br"};
                sendEmail.putExtra(Intent.EXTRA_EMAIL, addresses);

                // Corpo do e-mail.
                sendEmail.putExtra(Intent.EXTRA_TEXT, "Olá, quero um café!");

                // Assunto do e-mail.
                sendEmail.putExtra(Intent.EXTRA_SUBJECT, "Café!");

                // Verifica se existe algum app que resolve a intent
                if (sendEmail.resolveActivity(getPackageManager()) != null) {

                    // Inicia a intent
                    startActivity(sendEmail);

                    Log.i("E-mail", "Enviei o intent!");
                }
                Log.i("E-mail", "Botão pressionado!");

            }
        });


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
