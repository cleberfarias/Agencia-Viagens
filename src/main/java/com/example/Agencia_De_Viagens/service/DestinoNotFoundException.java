package com.example.Agencia_De_Viagens.service;

public class DestinoNotFoundException extends RuntimeException {
    public DestinoNotFoundException(Long idDestino) {
        super("Destino com ID " + idDestino + " não encontrado.");
    }
}
