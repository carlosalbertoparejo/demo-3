package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class SaludoController {

    @GetMapping("/saludo")
    public String saludo() {
        return "¡Hola, mundo!";
    }
}
