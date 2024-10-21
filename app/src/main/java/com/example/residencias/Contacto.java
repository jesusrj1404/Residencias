package com.example.residencias;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Contacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_contacto);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Referencias a los botones
        ImageButton imageButtonRegresar = findViewById(R.id.regresar);
        ImageButton imageButtonMapa = findViewById(R.id.imageButtonMapa);
        ImageButton imageButtonNosotros = findViewById(R.id.imageButton15);
        ImageButton imageButtonServicios = findViewById(R.id.imageButton12);
        ImageButton imageButtonContacto = findViewById(R.id.imageButton13);
        ImageButton imageButtonPrivacidad = findViewById(R.id.imageButton14);

        // Listener para imageButtonRegresar
        imageButtonRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirigir a la pantalla Login
                Intent intent = new Intent(Contacto.this, Login.class);
                startActivity(intent);
            }
        });

        // Listener para imageButtonMapa
        imageButtonMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define URI explícita para Google Maps
                Uri gmmIntentUri = Uri.parse("geo:19.441113,-99.162604?q=19.441113,-99.162604(Ciudad+de+Mexico)");

                // Crea el Intent sin especificar paquete explícito
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);

                // Agregar registro de depuración
                System.out.println("Iniciando intento de abrir Google Maps...");

                // Verificar si alguna app puede manejar este Intent

                    startActivity(mapIntent);

            }
        });

        // Listener para imageButtonNosotros
        imageButtonNosotros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirigir a la pantalla Nosotros
                Intent intent = new Intent(Contacto.this, Nosotros.class);
                startActivity(intent);
            }
        });

        // Listener para imageButtonServicios
        imageButtonServicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirigir a la pantalla Servicios
                Intent intent = new Intent(Contacto.this, Servicios.class);
                startActivity(intent);
            }
        });

        // Listener para imageButtonContacto
        imageButtonContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirigir a la pantalla Contacto
                Intent intent = new Intent(Contacto.this, Contacto.class);
                startActivity(intent);
            }
        });

        // Listener para imageButtonPrivacidad
        imageButtonPrivacidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirigir a la pantalla Privacidad
                Intent intent = new Intent(Contacto.this, Privacidad.class);
                startActivity(intent);
            }
        });
    }
}
