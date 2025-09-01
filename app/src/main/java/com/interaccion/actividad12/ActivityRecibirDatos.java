package com.interaccion.actividad12;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;


public class ActivityRecibirDatos extends AppCompatActivity {

    private TextView tn2;
    private TextView ta2;
    private TextView tc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recibir_datos);
        tn2 = (TextView)findViewById(R.id.tn2);
        ta2 = (TextView)findViewById(R.id.ta2);
        tc2 = (TextView)findViewById(R.id.tc2);
        String dato1 = getIntent().getStringExtra("dato1");
        String dato2 = getIntent().getStringExtra("dato2");
        String dato3 = getIntent().getStringExtra("dato3");
        tn2.setText(dato1);
        ta2.setText(dato2);
        tc2.setText(dato3);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void Volver(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}