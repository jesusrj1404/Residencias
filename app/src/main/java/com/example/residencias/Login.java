package com.example.residencias;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Referencia al botón de imagen
        ImageButton imageButtonNosotros = findViewById(R.id.imageButton15);
        Button BotonRegistro= findViewById(R.id.button9);
        ImageButton imageButtonServicios = findViewById(R.id.imageButton12);
        ImageButton imageButtonContacto = findViewById(R.id.imageButton13);
        ImageButton imageButtonPrivacidad = findViewById(R.id.imageButton14);



        BotonRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Registro.class);
                startActivity(intent);
            }
        });

        // Agregar un OnClickListener para que al hacer clic redirija a la actividad Nosotros
        imageButtonNosotros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirigir a la pantalla Nosotros
                Intent intent = new Intent(Login.this, Nosotros.class);
                startActivity(intent);
            }
        });

        imageButtonServicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirigir a la pantalla Nosotros
                Intent intent = new Intent(Login.this, Servicios.class);
                startActivity(intent);
            }
        });

        imageButtonContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirigir a la pantalla Nosotros
                Intent intent = new Intent(Login.this, Contacto.class);
                startActivity(intent);
            }
        });

        imageButtonPrivacidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirigir a la pantalla Nosotros
                Intent intent = new Intent(Login.this, Privacidad.class);
                startActivity(intent);
            }
        });
    }
}
