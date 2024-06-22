package com.example.Agencia_De_Viagens.controller;

import com.example.Agencia_De_Viagens.entity.Destino;
import com.example.Agencia_De_Viagens.service.DestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/destinos") // Mapeia todas as requisições para o caminho "/destinos"
public class DestinoController {

    @Autowired
    private DestinoService destinoService;

    // Método para obter detalhes de um destino por ID
    @GetMapping("/{id}") // Mapeia para GET em "/destinos/{id}"
    public ResponseEntity<Destino> obterDetalhesDestino(@PathVariable Long id) {
        Destino destino = destinoService.obterDetalhesDestino(id);
        if (destino != null) {
            return ResponseEntity.ok(destino);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Método para cadastrar um novo destino
    @PostMapping("/cadastrar") // Mapeia para POST em "/destinos/cadastrar"
    public ResponseEntity<Destino> cadastrarDestino(@RequestBody Destino novoDestino) {
        // Lógica para cadastrar o destino
        Destino destinoSalvo = destinoService.cadastrarDestino(novoDestino);
        return ResponseEntity.created(URI.create("/destinos/" + destinoSalvo.getId())).body(destinoSalvo);
    }

    // Método para atualizar um destino existente por ID
    @PutMapping("/{id}") // Mapeia para PUT em "/destinos/{id}"
    public ResponseEntity<Destino> atualizarDestino(@PathVariable Long id, @RequestBody Destino destinoAtualizado) {
        // Lógica para atualizar o destino
        Destino destinoSalvo = destinoService.atualizarDestino(id, destinoAtualizado);
        if (destinoSalvo != null) {
            return ResponseEntity.ok(destinoSalvo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Método para excluir um destino por ID
    @DeleteMapping("/{id}") // Mapeia para DELETE em "/destinos/{id}"
    public ResponseEntity<Void> excluirDestino(@PathVariable Long id) {
        destinoService.excluirDestino(id);
        return ResponseEntity.noContent().build();
    }

    // Método para listar todos os destinos cadastrados
    @GetMapping // Mapeia para GET em "/destinos"
    public ResponseEntity<List<Destino>> listarDestinos() {
        List<Destino> destinos = destinoService.listarDestinos();
        return ResponseEntity.ok(destinos);
    }
}
