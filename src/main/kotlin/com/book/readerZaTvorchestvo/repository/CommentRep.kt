package com.book.readerZaTvorchestvo.repository

import com.book.readerZaTvorchestvo.model.Comment
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CommentRep : JpaRepository<Comment, Long> {

    fun findByBookId(bookId: Long): List<Comment>

    fun findByUserId(userId: Long): List<Comment>
}