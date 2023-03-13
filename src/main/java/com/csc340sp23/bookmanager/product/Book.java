package com.csc340sp23.bookmanager.product;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Entity
@Table(name = "book")
@NoArgsConstructor
@Getter
@Setter


/**
 *
 * @author Hayden Perusek
 */
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String author;
    private String ibsn;
    private double price;

    public Book(long id, String title, String author, String ibsn, double price) {
        this.author = author;
        this.title = title;
        this.id = id;
        this.ibsn = ibsn;
        this.price = price;
    }
}
