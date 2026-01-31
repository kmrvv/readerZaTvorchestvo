package com.book.readerZaTvorchestvo.service

import com.book.readerZaTvorchestvo.model.Comment
import com.book.readerZaTvorchestvo.model.Wishlist
import com.book.readerZaTvorchestvo.repository.CommentRep
import com.book.readerZaTvorchestvo.repository.WishlistRep
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class ReviewService(
    private val commentRep: CommentRep,
    private val wishlistRep: WishlistRep
) {

    @Transactional(readOnly = true)
    fun getBookComments(bookId: Long): List<Comment> {
        return commentRep.findByBookId(bookId)
    }

    @Transactional
    fun createComment(comment: Comment): Comment {
        return commentRep.save(comment)
    }

    @Transactional
    fun deleteComment(commentId: Long) {
        commentRep.deleteById(commentId)
    }

    @Transactional
    fun addWishlist(wish: Wishlist): Wishlist {
        return wishlistRep.save(wish)
    }

    @Transactional
    fun deleteWishlist(wishlistId: Long) {
        wishlistRep.deleteById(wishlistId)
    }

    @Transactional(readOnly = true)
    fun getUserWishlist(userId: Long): List<Wishlist> {
        return wishlistRep.getByUserId(userId)
    }

    @Transactional
    fun getUserComments(userId: Long) : List<Comment> {
        return commentRep.findByUserId(userId)
    }
}