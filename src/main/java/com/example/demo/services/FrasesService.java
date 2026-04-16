package com.example.demo.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class FrasesService {

    private final List<String> frases = new ArrayList<>(List.of(
            "El tiempo sin ti es solo -empo",
            "Mientras uno está vivo debe amar lo que más pueda",
            "El perro de san roque no tiene rabo",
            "Mantenlo simple, estúpido",
            "Si saben cómo me pongo pa qué me invitan"
    ));

    public String obtenerFraseAleatoria() {
        Random random = new Random();
        return frases.get(random.nextInt(frases.size()));
    }

    public List<String> obtenerTodas() {
        return frases;
    }

    public void agregarFrase(String frase) {
        frases.add(frase);
    }
}
