/*
 *@author: Otávio Gabriel Ribeiro Scabio - RA 1110482223043
 */

package com.example.atv3_exrc2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText Consumo;
    private EditText Tanque;
    private Button Calcular;
    private TextView Res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Consumo = findViewById(R.id.etConsumo);
        Tanque = findViewById(R.id.etTanque);
        Calcular = findViewById(R.id.btnCalcular);
        Res = findViewById(R.id.tvRes);

        Calcular.setOnClickListener(op -> calc());

    }


    public void calc (){

    float consumo = Float.parseFloat(Consumo.getText().toString());
    float tanque = Float.parseFloat(Tanque.getText().toString());
    float resultado = tanque*consumo*1000;

    Res.setText("Seu carro ainda pode percorrer "+resultado+" metros");

    }


}