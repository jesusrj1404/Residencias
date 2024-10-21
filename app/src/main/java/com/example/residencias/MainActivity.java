package com.example.residencias;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private static final int SPLASH_DURATION = 4000; // Duración de 4 segundos para la pantalla de carga

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Aplicar insets para la ventana
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Obtener el ImageView para la animación de pulsación
        ImageView logoImageView = findViewById(R.id.logo);

        // Cargar la animación de pulsación
        Animation pulseAnimation = AnimationUtils.loadAnimation(this, R.anim.pulse_animation);

        // Iniciar la animación de pulsación
        logoImageView.startAnimation(pulseAnimation);

        // Handler para retrasar el cambio de actividad durante 4 segundos
        new Handler().postDelayed(() -> {
            // Después de 4 segundos, ir a la pantalla de LoginActivity
            Intent intent = new Intent(MainActivity.this, Login.class);
            startActivity(intent);
            finish(); // Finalizar MainActivity para que el usuario no pueda volver a ella
        }, SPLASH_DURATION);
    }
}

