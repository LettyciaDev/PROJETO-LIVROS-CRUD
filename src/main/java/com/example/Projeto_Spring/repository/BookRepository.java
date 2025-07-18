package com.example.Projeto_Spring.repository;

import com.example.Projeto_Spring.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

// Responsavel por se conectar com o banco de dados
public interface BookRepository extends JpaRepository<Book, Long> {
}
