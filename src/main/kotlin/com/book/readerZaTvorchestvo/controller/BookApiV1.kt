package com.book.readerZaTvorchestvo.controller

import com.book.readerZaTvorchestvo.model.Book
import com.book.readerZaTvorchestvo.model.BookRating
import com.book.readerZaTvorchestvo.service.BookService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

// todo paging - dto - req -res - advice
// todo formating

@RestController
@RequestMapping("api/v1/book")
class BookApiV1(
    private val bookService: BookService
) {

    @GetMapping
    fun getAll() : List<Book> {
        return bookService.findAll()
    }

    @GetMapping("/{id}")
    fun getBook(@PathVariable id : Long) : Book? {
        return bookService.findById(id)
    }

    @GetMapping("/{id}/rating")
    fun getBookRating(@PathVariable id : Long) : BookRating? {
        return bookService.getRating(id)
    }

    @PostMapping
    fun addBook(@RequestBody book: Book) : Book {
        return bookService.createBook(book)
    }

    //todo
    @PutMapping
    fun updateBook() {

    }

    @DeleteMapping("/{id}")
    fun deleteBook(@PathVariable id : Long) {
        bookService.delete(id)
    }
}