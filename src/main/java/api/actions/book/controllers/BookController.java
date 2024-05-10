package api.actions.book.controllers;

import api.actions.book.models.BookModel;
import api.actions.book.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<BookModel> list() {
        return this.bookRepository.findAll();
    }

    @PostMapping
    public BookModel create(@RequestBody BookModel bookModel) {
        return this.bookRepository.save(bookModel);
    }
}
