package com.myserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.seu_pacote.model.SeuModelo;
import com.seu_pacote.service.SeuModeloService;

import java.util.List;

@RestController
@RequestMapping("/api/seumodelo")
public class SeuModeloController {
    @Autowired
    private SeuModeloService service;

    @GetMapping
    public List<SeuModelo> listar() {
        return service.listar();
    }

    @PostMapping
    public SeuModelo criar(@RequestBody SeuModelo modelo) {
        return service.criar(modelo);
    }
}