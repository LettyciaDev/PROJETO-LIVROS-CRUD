package com.example.Projeto_Spring.service;

import com.example.Projeto_Spring.model.Book;
import com.example.Projeto_Spring.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    // injecao de dependencia
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    // LISTAR
    public List<Book> getAll(){
        return bookRepository.findAll();
    }

    // CRIAR
    public Book save(Book book){
        return bookRepository.save(book);
    }

    // DELETAR
    public void delete(Long id){
        bookRepository.deleteById(id);
    }
}
