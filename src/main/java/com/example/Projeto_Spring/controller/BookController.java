package com.example.Projeto_Spring.controller;

import com.example.Projeto_Spring.model.Book;
import com.example.Projeto_Spring.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //
@RequestMapping("/book")
public class BookController {
    // injecao de dependencia
    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    // Requisicoes: GET, SET, PUT, DELETE
    @GetMapping // Listagem
    public List<Book> getAll(){
        return bookService.getAll();
    }

    @PostMapping // Enviando informcoes para o servidor
    public Book creat(@RequestBody Book book){
        return bookService.save(book);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        bookService.delete(id);
    }
}
