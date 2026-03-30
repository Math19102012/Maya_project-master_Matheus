package com.example.maya_project;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class ExerciciosActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicios);

        // Carrega o fragment na tela
        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.containerFragment, new ExerciciosFragment())
                    .commit();
        }
    }
}