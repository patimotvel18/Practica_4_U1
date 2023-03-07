package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_suma;
    private Button btn_resta;
    private Button btn_multiplicacion;
    private Button btn_division;

    private TextView text_respuesta;


    private EditText numero_1;
    private EditText numero_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "listo", Toast.LENGTH_SHORT).show();

        text_respuesta = findViewById(R.id.respuesta);
        numero_1= findViewById(R.id.numero1);
        numero_2 = findViewById(R.id.numero2);


        btn_suma = findViewById(R.id.boton_suma);
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText(suma(Integer.parseInt(numero_1.getText().toString()),Integer.parseInt(numero_2.getText().toString()))+"");
            }
        });

        btn_resta = findViewById(R.id.boton_resta);
        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText(resta(Integer.parseInt(numero_1.getText().toString()),Integer.parseInt(numero_2.getText().toString()))+"");
            }
        });

        btn_multiplicacion = findViewById(R.id.boton_multiplicacion);
        btn_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText(multiplicacion(Integer.parseInt(numero_1.getText().toString()),Integer.parseInt(numero_2.getText().toString()))+"");
            }
        });

        btn_division = findViewById(R.id.boton_division);
        btn_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText(division(Integer.parseInt(numero_1.getText().toString()),Integer.parseInt(numero_2.getText().toString()))+"");
            }
        });
    }
    public  int suma (int a, int b){
        return a+b;
    }
    public  int resta (int a, int b){
        return a-b;
    }
    public  int multiplicacion (int a, int b){
        return a*b;
    }
    public  double division (int a, int b){
        int respuesta=0;

        if(b!=0){
            respuesta=a/b;
        }
        return respuesta;
    }
}