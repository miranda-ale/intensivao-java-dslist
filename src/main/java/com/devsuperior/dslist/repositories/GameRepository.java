package com.devsuperior.dslist.repositories;

// Componente responsável por fazer consulta ao bando de dados (repository)

import com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {



}
