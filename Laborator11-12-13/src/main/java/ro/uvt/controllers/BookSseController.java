package ro.uvt.controllers;

import ro.uvt.models.AllBooksSubject;
import ro.uvt.models.Book;
import ro.uvt.models.SseObserver;
import ro.uvt.services.BookService;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/bookSse")
public class BookSseController {

    private final BookService service;
    private final AllBooksSubject allBooksSubject;

    public BookSseController(BookService service) {
        this.service= service;
        this.allBooksSubject = new AllBooksSubject();
    }

    @RequestMapping("/books-sse")
    public ResponseBodyEmitter getBooksSse() {
        final SseEmitter emitter = new SseEmitter(0L);
        allBooksSubject.attach(new SseObserver(emitter));
        return emitter;
    }

    @PostMapping("/save")
    public String newBook(@RequestBody Book book) {
        service.saveBook(book);
        allBooksSubject.addBook(book);
        return "Book saved [" + book.getId() + "] " + book.getTitle();
    }

}
