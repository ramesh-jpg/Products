package com.DemoProject.Product.Service;

import com.DemoProject.Product.Entity.Book;
import com.DemoProject.Product.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    //initialize the BookRepository
    private BookRepository bookRepository;

    public List<Book>getallBooks(){
        return bookRepository.findAll();
    }

    public Optional<Book>getBooks(Long id){
        return bookRepository.findById(id);
    }

    public Book createBook(Book book){
        return bookRepository.save(book);
    }

    public Book addOrupdateBook(Book book){
        return bookRepository.save(book);
    }

    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }

    public List<Book> findByPublishedDateAfter(LocalDate date) {
        return bookRepository.findByPublishedDateAfter(date);
    }
    public List<Book> findByTittle(String tittle) {
        return bookRepository.findByTittle(tittle);
    }
}
