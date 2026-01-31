package com.book.readerZaTvorchestvo.controller

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("api/v1/book")
class BookApiV1 {

    @GetMapping
    fun getAll() {

    }

    @GetMapping("/{id}")
    fun getBook() {

    }

    @GetMapping("/{id}/rating")
    fun getBookRating() {

    }

    @PostMapping
    fun addBook() {

    }

    @PutMapping("/{id}")
    fun updateBook() {

    }

    @DeleteMapping("/{id}")
    fun deleteBook() {

    }
}