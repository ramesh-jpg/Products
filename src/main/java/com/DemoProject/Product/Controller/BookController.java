package com.DemoProject.Product.Controller;

import com.DemoProject.Product.Entity.Book;
import com.DemoProject.Product.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    //inialize the Bookservice
    private BookService bookService;

    @GetMapping("/getbooks")
    public List<Book> getallBook() {
        return bookService.getallBooks();

    }

    @GetMapping("/getbook/{id}")
    public Optional<Book> getBook(@PathVariable Long id) {
        return bookService.getBooks(id);
    }

    @PostMapping("/createbook")
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @PostMapping("/updatebook")
    public Book addOrupdateBook(@RequestBody Book book) {
        return bookService.addOrupdateBook(book);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }

    @GetMapping("/find/date-after/{date}")
    public List<Book> findByPublishedDateAfter(
            @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date) {
        return bookService.findByPublishedDateAfter(date);

    }

    @GetMapping("/find/title/{title}")
    public List<Book> findByTitle(@PathVariable String title) {
        return bookService.findByTittle(title);
    }
}