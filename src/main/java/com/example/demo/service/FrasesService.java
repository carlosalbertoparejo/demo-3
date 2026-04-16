package com.example.demo.service;

import com.example.demo.repository.FrasesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class FrasesService {

    private final FrasesRepository frasesRepository;
    private final Random random = new Random(); // lo mantenemos aquí

    public FrasesService(FrasesRepository frasesRepository) {
        this.frasesRepository = frasesRepository;
    }

    public String obtenerFraseAleatoria() {
        List<String> frases = frasesRepository.obtenerTodasFrases();
        return frases.get(random.nextInt(frases.size()));
    }

    public List<String> obtenerTodas() {
        return frasesRepository.obtenerTodasFrases();
    }

    public void agregarFrase(String frase) {
        frasesRepository.agregarFrase(frase);
    }
}
