package api.ms.bookgitactions.controllers;

import api.ms.bookgitactions.models.BookModel;
import api.ms.bookgitactions.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<BookModel> getAllBooks() {
        return this.bookRepository.findAll();
    }

    @PostMapping
    public BookModel createBook(@RequestBody BookModel bookModel) {
        return this.bookRepository.save(bookModel);
    }
}
