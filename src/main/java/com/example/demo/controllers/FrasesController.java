package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

@RestController
@RequestMapping("/api")
public class FrasesController {

    private final List<String> frases = new ArrayList<>(List.of(
            "El tiempo sin ti es solo -empo",
            "Mientras uno está vivo debe amar lo que más pueda",
            "El perro de san roque no tiene rabo",
            "Mantenlo simple, estúpido",
            "Si saben cómo me pongo pa qué me invitan"
    ));

    @GetMapping("/frase")
    public Map<String, Object> fraseAleatoria() {
        Random random = new Random();
        String frase = frases.get(random.nextInt(frases.size()));

        return Map.of(
                "frase", frase,
                "hora", LocalTime.now().toString()
        );
    }

    @PostMapping("/frase")
    public Map<String, Object> agregarFrase(@RequestBody Map<String, String> body) {
        String nuevaFrase = body.get("frase");
        frases.add(nuevaFrase);

        return Map.of(
                "mensaje", "Frase agregada correctamente",
                "totalFrases", frases.size()
        );
    }
}
