package com.example.demo.controllers;

import com.example.demo.services.FrasesService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class FrasesController {

    private final FrasesService frasesService;

    public FrasesController(FrasesService frasesService) {
        this.frasesService = frasesService;
    }

    @GetMapping("/frase")
    public Map<String, String> obtenerFrase() {
        return Map.of(
                "frase", frasesService.obtenerFraseAleatoria()
        );
    }

    @PostMapping("/frase")
    public Map<String, Object> agregarFrase(@RequestBody Map<String, String> body) {
        String nuevaFrase = body.get("frase");
        frasesService.agregarFrase(nuevaFrase);

        return Map.of(
                "mensaje", "Frase agregada correctamente",
                "totalFrases", frasesService.obtenerTodas().size()
        );
    }

    @GetMapping("/frases")
    public Map<String, Object> listarFrases() {
        return Map.of(
                "total", frasesService.obtenerTodas().size(),
                "frases", frasesService.obtenerTodas()
        );
    }
}
