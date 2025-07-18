package com.example.Projeto_Spring.model;

import jakarta.persistence.*;

@Entity // sinaliza ao banco de dados que a esta classe é uma entidade
@Table(name = "book_table")
public class Book {
    @Id // gera um id automaticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY) // informa que o valor do id deve ser incrementado sempre que for gerado um novo
    private Long id;
    private String name;
    private String gener;
    private String author;
    private int year;

    public Book() {
    }

    public Book(Long id, String name, String gener, String author, int year) {
        this.id = id;
        this.name = name;
        this.gener = gener;
        this.author = author;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getGener(){
        return gener;
    }

    public void setGener(String gener){
        this.gener = gener;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

}
