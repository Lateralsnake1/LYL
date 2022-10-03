package com.example.lyl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    num1 = (EditText) findViewById(R.id.txtnumero1);
    num2 = (EditText) findViewById(R.id.txtnumero2);
    result = (TextView) findViewById(R.id.txtresultado);

    }
    public void Restar(View view){
        double n1, n2, rest;
        n1 = Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());
        rest = n1 - n2;

        result.setText(""+rest);
    }
    public void sumar(View view){

        double n1, n2, suma;
        n1 = Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());
        suma = n1 + n2;

        result.setText(""+suma);
    }
    public void Multi(View view){
        double n1, n2, multi;
        n1 = Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());
        multi = n1*n2;

        result.setText(""+multi);
}
    public void Div(View view){
        double n1, n2, div;
        n1 = Double.parseDouble(num1.getText().toString());
        n2 = Double.parseDouble(num2.getText().toString());
        div = n1/n2;

        result.setText(""+div);
}}
