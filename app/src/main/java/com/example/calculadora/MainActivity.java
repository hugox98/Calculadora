package com.example.calculadora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    String numero1;
    String numero2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText  numer1= (EditText) findViewById(R.id.num1);
        final EditText numer2 = (EditText) findViewById(R.id.num2);

        final TextView txtResultado = (TextView) findViewById(R.id.resul);

        final Button btnSumar = (Button) findViewById(R.id.btnSumar);
        final Button btnRestar = (Button) findViewById(R.id.btnResta);
        final Button btnMultiplicar = (Button) findViewById(R.id.btnMulti);
        final Button btnDivision = (Button) findViewById(R.id.btnDiv);
        final Button btnPotencia = (Button) findViewById(R.id.btnPot);
        final Button btnPorcentaje=(Button) findViewById(R.id.btnPorcentaje);
        btnSumar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            numero1 = String.valueOf(numer1.getText());
            int n1 = Integer.parseInt(numero1);

            numero2 = String.valueOf(numer2.getText());
            int n2 = Integer.parseInt(numero2);

            int resultado = n1 + n2;

            txtResultado.setText(Integer.toString(resultado));

        }
    });
        btnRestar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View b) {
            numero1 = String.valueOf(numer1.getText());
            int v1 = Integer.parseInt(numero1);
            numero2 = String.valueOf(numer2.getText());
            int v2 = Integer.parseInt(numero2);
            int resul = v1 - v2;
            txtResultado.setText(Integer.toString(resul));
        }
    });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View a) {
            numero1 = String.valueOf(numer1.getText());
            int v1 = Integer.parseInt(numero1);
            numero2 = String.valueOf(numer2.getText());
            int v2 = Integer.parseInt(numero2);
            int resul = v1 * v2;
            txtResultado.setText(Integer.toString(resul));
        }
    });
        btnDivision.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View c) {
            numero1 = String.valueOf(numer1.getText());
            int v1 = Integer.parseInt(numero1);
            numero2 = String.valueOf(numer2.getText());
            int v2 = Integer.parseInt(numero2);
            int resul = v1 / v2;
            txtResultado.setText(Integer.toString(resul));
        }
    });
        btnPotencia.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            numero1 = String.valueOf(numer1.getText());
            int v1 = Integer.parseInt(numero1);
            numero2 = String.valueOf(numer1.getText());
            int v2 = Integer.parseInt(numero2);
            int resul=(int) Math.pow(v1,v2);
            txtResultado.setText(Integer.toString(resul));
        }
    });
        btnPorcentaje.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View c) {
            numero1 = String.valueOf(numer1.getText());
            int a = Integer.parseInt(numero1);
            numero2 = String.valueOf(numer2.getText());
            int b = Integer.parseInt(numero2);
            int resul=(a*b)/100;
            txtResultado.setText(Integer.toString(resul));
        }
    });

}
    }






