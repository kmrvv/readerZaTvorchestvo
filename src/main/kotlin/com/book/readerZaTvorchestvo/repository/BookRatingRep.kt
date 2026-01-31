package com.book.readerZaTvorchestvo.repository

import com.book.readerZaTvorchestvo.model.BookRating
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRatingRep : JpaRepository<BookRating, Long> {

    fun findByBookId(bookId: Long): BookRating?

}