package com.book.readerZaTvorchestvo.controller

import com.book.readerZaTvorchestvo.model.Comment
import com.book.readerZaTvorchestvo.model.Wishlist
import com.book.readerZaTvorchestvo.service.ReviewService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/review")
class ReviewApiV1(
    private val reviewService : ReviewService
) {

    @GetMapping("/comments/{bookId}")
    fun getBookComments(@PathVariable bookId: Long) : List<Comment> {
        return reviewService.getBookComments(bookId)
    }

    @GetMapping("/wishlist/{userId}")
    fun getUserWishlist(@PathVariable userId: Long) : List<Wishlist> {
        return reviewService.getUserWishlist(userId)
    }

    @GetMapping("user/{userId}/comments")
    fun getUserComments(@PathVariable userId: Long) : List<Comment> {
        return reviewService.getUserComments(userId)
    }

    @PostMapping("/comments")
    fun addComment(@RequestBody comment: Comment) : Comment {
        return reviewService.createComment(comment)
    }

    //todo
    fun updateComment() {

    }

    @DeleteMapping("/comments/{commentId}")
    fun deleteComment(@PathVariable commentId: Long) {
        reviewService.deleteComment(commentId)
    }

    @PostMapping("/wishlist")
    fun addWishlist(@RequestBody wish : Wishlist) : Wishlist {
        return reviewService.addWishlist(wish)
    }

    //todo
    fun updateWishlist() {

    }

    @DeleteMapping("/wishlist/{wishlistId}")
    fun deleteWishlist(wishlistId: Long) {
        reviewService.deleteWishlist(wishlistId)
    }


    //todo implement rating
}