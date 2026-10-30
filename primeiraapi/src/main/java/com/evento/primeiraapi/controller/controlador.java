package com.evento.primeiraapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
@RequestMapping 
public class controlador {
    @GetMapping("path")
    public String fornecedor(@RequestParam String param) {
        return new String();
    }
    
}
