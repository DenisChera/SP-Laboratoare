package ro.uvt.controllers;

import ro.uvt.models.Book;
import ro.uvt.services.BookService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BooksController {

    private final BookService service;

    public BooksController(BookService service) {
        this.service= service;
    }

    @PostMapping("/save")
    public ResponseEntity<Book> saveBook(@RequestBody Book item) {
        return new ResponseEntity<>(service.saveBook(item), HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public List<Book> getAll() {
        return service.getAll();
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity deleteItem(@PathVariable Long id) {
        service.deleteBook(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        return new ResponseEntity<>(service.getBook(id), HttpStatus.OK);
    }

}
