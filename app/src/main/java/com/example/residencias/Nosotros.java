package com.example.residencias;

import static com.example.residencias.R.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Nosotros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nosotros);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton imageButtonNosotros = findViewById(R.id.imageButton15);
        ImageButton imageButtonServicios = findViewById(R.id.imageButton12);
        ImageButton imageButtonRegresar = findViewById(id.volver);
        ImageButton imageButtonContacto = findViewById(R.id.imageButton13);
        ImageButton imageButtonPrivacidad = findViewById(R.id.imageButton14);


        imageButtonNosotros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirigir a la pantalla Nosotros
                Intent intent = new Intent(Nosotros.this, Nosotros.class);
                startActivity(intent);
            }
        });


        imageButtonServicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirigir a la pantalla Nosotros
                Intent intent = new Intent(Nosotros.this, Servicios.class);
                startActivity(intent);
            }
        });

        imageButtonRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirigir a la pantalla Nosotros
                Intent intent = new Intent(Nosotros.this, Login.class);
                startActivity(intent);
            }
        });

        imageButtonContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirigir a la pantalla Nosotros
                Intent intent = new Intent(Nosotros.this, Contacto.class);
                startActivity(intent);
            }
        });

        imageButtonPrivacidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirigir a la pantalla Nosotros
                Intent intent = new Intent(Nosotros.this, Privacidad.class);
                startActivity(intent);
            }
        });
    }
}