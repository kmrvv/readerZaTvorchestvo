package com.book.readerZaTvorchestvo.repository

import com.book.readerZaTvorchestvo.model.BookRating
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRep : JpaRepository<BookRating, Long> {
}