package com.myserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.seu_pacote.repository.SeuModeloRepository;

@Service
public class SeuModeloService {
    @Autowired
    private SeuModeloRepository repository;

    // Métodos para manipulação de dados
}