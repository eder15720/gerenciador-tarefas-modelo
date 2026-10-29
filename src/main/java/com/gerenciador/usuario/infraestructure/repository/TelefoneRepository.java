package com.gerenciador.usuario.infraestructure.repository;

import com.example.demo.infraestructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
