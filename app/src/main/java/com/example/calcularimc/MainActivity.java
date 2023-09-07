package com.example.calcularimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textResultado;
    private EditText editPeso;
    private EditText editAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResultado = findViewById(R.id.textResultado); //Procure um componente pelo id
        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);

    }

    //Aqui eu coloco os métodos responsáveis pelos calculos e operações no meu app

    public void calcularImc(View view) { //o view é obrigatório para o método ser enxergado na bio

        double peso = Double.parseDouble(editPeso.getText().toString()); //passa informação do peso de texto para double para caber na variavel
        double altura = Double.parseDouble(editAltura.getText().toString());
        double resultado = peso / (altura * altura);

        if (resultado < 19){

            textResultado.setText("Abaixo do peso");

        }else if(resultado <= 19 || resultado < 25){

            textResultado.setText("Peso normal");

        }else if(resultado <= 25 || resultado < 30){

            textResultado.setText("SobrePeso");

        }else if(resultado <= 30 || resultado < 40){

            textResultado.setText("Obesidade tipo I");

        }else if(resultado >= 25){

            textResultado.setText("Obesidade tipo II");

        }
    }

}