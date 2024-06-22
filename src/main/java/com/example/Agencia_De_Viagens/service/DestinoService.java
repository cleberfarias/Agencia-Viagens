package com.example.Agencia_De_Viagens.service;

import com.example.Agencia_De_Viagens.entity.Destino;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DestinoService {

    // Método fictício para simular o armazenamento de destinos
    private List<Destino> destinos = new ArrayList<>();

    // Método para cadastrar um novo destino
    public Destino cadastrarDestino(Destino novoDestino) {
        novoDestino.setId((long) (destinos.size() + 1)); // Simula a geração de ID
        destinos.add(novoDestino);
        return novoDestino;
    }

    // Método para atualizar um destino existente
    public Destino atualizarDestino(Long id, Destino destinoAtualizado) {
        for (int i = 0; i < destinos.size(); i++) {
            if (destinos.get(i).getId().equals(id)) {
                destinos.set(i, destinoAtualizado);
                return destinoAtualizado;
            }
        }
        return null; // Retorna null se o destino não for encontrado
    }

    // Método para excluir um destino
    public void excluirDestino(Long id) {
        destinos.removeIf(destino -> destino.getId().equals(id));
    }

    // Método para obter detalhes de um destino por ID
    public Destino obterDetalhesDestino(Long id) {
        for (Destino destino : destinos) {
            if (destino.getId().equals(id)) {
                return destino;
            }
        }
        return null; // Retorna null se o destino não for encontrado
    }

    // Método para listar todos os destinos
    public List<Destino> listarDestinos() {
        return destinos;
    }
}
