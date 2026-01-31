package com.book.readerZaTvorchestvo.repository

import com.book.readerZaTvorchestvo.model.Book
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRep : JpaRepository<Book, Long> {
}