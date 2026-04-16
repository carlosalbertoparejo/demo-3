package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FrasesRepository {

    private final List<String> frases = List.of(
            "El tiempo sin ti es solo -empo",
            "Mientras uno está vivo debe amar lo que más pueda",
            "El perro de san roque no tiene rabo",
            "Mantenlo simple, estúpido",
            "Si saben cómo me pongo pa qué me invitan"
    );

    public List<String> obtenerTodasFrases() {
        return frases;
    }

    public void agregarFrase(String frase) {
        frases.add(frase);
    }
}
