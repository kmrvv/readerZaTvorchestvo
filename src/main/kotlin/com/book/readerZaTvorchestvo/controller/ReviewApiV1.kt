package com.book.readerZaTvorchestvo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/review")
class ReviewApiV1 {

    @GetMapping("/{bookId}")
    fun getBookComments() {

    }

    fun getUserComments() {

    }

    fun addComment() {

    }

    fun addWishlist() {

    }
}