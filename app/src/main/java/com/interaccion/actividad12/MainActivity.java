package com.interaccion.actividad12;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText tn1;
    private EditText ta1;
    private EditText tc1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        tn1 = (EditText)findViewById(R.id.tn1);
        ta1 = (EditText)findViewById(R.id.ta1);
        tc1 = (EditText)findViewById(R.id.tc1);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    //Método para el botón enviar
    public void EnviarDatos(View view){
        Intent i = new Intent(this, ActivityRecibirDatos.class);
        i.putExtra("dato1", tn1.getText().toString());
        i.putExtra("dato2", ta1.getText().toString());
        i.putExtra("dato3", tc1.getText().toString());
        startActivity(i);
    }
}