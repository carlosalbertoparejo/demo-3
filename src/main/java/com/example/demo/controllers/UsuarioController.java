package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    @GetMapping("/usuario")
    public Map<String, Object> info() {
        return Map.of(
                "nombre", "Carlos",
                "edad", 30,
                "email", "carlos@example.com"
        );
    }
}
