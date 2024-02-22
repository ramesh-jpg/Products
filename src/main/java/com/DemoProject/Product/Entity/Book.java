package com.DemoProject.Product.Entity;

import jakarta.persistence.*;


import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tittle;
    private BigDecimal price;
    private LocalDate publish_Date;

    public Book() {

    }

    //No argument constructor
    public Book(String s, BigDecimal bigDecimal, LocalDate localDate) {

    }

    //Argument constructor
    public Book(Long id, String tittle, BigDecimal price, LocalDate publishDate) {
        this.id = id;
        this.tittle = tittle;
        this.price = price;
        this.publish_Date = publishDate;
    }

    //getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getPublishDate() {
        return publish_Date;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publish_Date = publishDate;
    }

    //tostring method
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", tittle='" + tittle + '\'' +
                ", price=" + price +
                ", publishDate=" + publish_Date +
                '}';
    }
}
