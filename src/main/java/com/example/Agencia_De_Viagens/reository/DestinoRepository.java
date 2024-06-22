package com.example.Agencia_De_Viagens.reository;

import com.example.Agencia_De_Viagens.entity.Destino;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface DestinoRepository extends JpaRepository<Destino, Long> {

    List<Destino> findByNomeContainingIgnoreCase(String nome);

    List<Destino> findByPaisContainingIgnoreCase(String pais);

    List<Destino> findByCidadeContainingIgnoreCase(String cidade);

}