package com.example.android.brazilquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public int verificaRespostas() {

        int score = 0;

        //Pergunta 1. Qual a capital do Brasil
        RadioButton brasilia = (RadioButton) findViewById(R.id.radio_brasilia);
        if (brasilia.isChecked()) {
            score += 1;
        }

        // Pergunta 2. Qual o maior rio do Brasil
        RadioButton amazonas = (RadioButton) findViewById(R.id.radio_amazonas);
        if (amazonas.isChecked()) {
            score += 1;
        }

        // Pergunta 3. Qual a Capital do Estado do Ceará
        EditText capital = (EditText) findViewById(R.id.capitalDoCeara);
        if (capital.getText().toString().equalsIgnoreCase("fortaleza")) {
            score += 1;
        }


        // Pergunta 4. Esporte mais popular
        EditText esporte = (EditText) findViewById(R.id.esporteMaisPopular);
        if (esporte.getText().toString().equalsIgnoreCase("futebol")) {
            score += 1;
        }

        // Pergunta 5. Qual a maior cidade do Brasil
        RadioButton maiorCidade = (RadioButton) findViewById(R.id.radio_sao_paulo);
        if (maiorCidade.isChecked()) {
            score += 1;
        }

        //Pergunta 6. Quais os 3 principais rios do Brasil
        CheckBox amazonasCheck = (CheckBox) findViewById(R.id.check_amazonas);
        CheckBox parana = (CheckBox) findViewById(R.id.check_parana);
        CheckBox madeira = (CheckBox) findViewById(R.id.check_madeira);
        if (amazonasCheck.isChecked() && parana.isChecked() && madeira.isChecked()) {
            score += 1;
        }

        //Pergunta 7. O Brasil é o maior em território
        RadioButton brasilMaior = (RadioButton) findViewById(R.id.territorioNao);
        if (brasilMaior.isChecked()) {
            score += 1;
        }

        // Pergunta 8.Qual a capital do Brasil
        RadioButton brasiliaCapital = (RadioButton) findViewById(R.id.capitalBrasilia);
        if (brasiliaCapital.isChecked()) {
            score += 1;
        }

        // Pergunta 9. Duas Cores da Bandeira do brasil
        CheckBox azul = (CheckBox) findViewById(R.id.check_bandeira_azul);
        CheckBox verde = (CheckBox) findViewById(R.id.check_bandeira_verde);
        if (azul.isChecked() && verde.isChecked()) {
            score += 1;
        }

        // Pergunta 10. Quantas estrelas na bandeira do brasil
        RadioButton estrelas27 = (RadioButton) findViewById(R.id.radio_27_estrelas);
        if (estrelas27.isChecked()) {
            score += 1;
        }

        return score;
    }

    public void enviarRespostas(View view) {
        int score = verificaRespostas();
        if (score == 0) {
            Toast.makeText(this, "Péssimo desempenho, não acertou nada!", Toast.LENGTH_LONG).show();

        } else if (score == 10) {
            Toast.makeText(this, "Parabéns, você acertou tudo  !!", Toast.LENGTH_SHORT).show();
        } else if (score > 0 && score < 5) {
            Toast.makeText(this, "Conheça precisa conhecer o Brasil. Acertou só " + score + " perguntas", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Faltou pouco: " + score + " Acertos !", Toast.LENGTH_SHORT).show();
        }
    }
}

