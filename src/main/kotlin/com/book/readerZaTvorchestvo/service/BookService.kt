package com.book.readerZaTvorchestvo.service

import com.book.readerZaTvorchestvo.model.Book
import com.book.readerZaTvorchestvo.model.BookRating
import com.book.readerZaTvorchestvo.repository.BookRatingRep
import com.book.readerZaTvorchestvo.repository.BookRep
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class BookService(
    private val bookRep: BookRep,
    private val bookRatingRep: BookRatingRep,
) {
    @Transactional(readOnly = true)
    fun findAll(): List<Book> {
        return bookRep.findAll().toList()
    }

    fun findById(id: Long): Book? {
        return bookRep.findByIdOrNull(id)
    }

    fun getRating(bookId: Long) : BookRating? {
        return bookRatingRep.findByBookId(bookId)
    }

    @Transactional
    fun createBook(book: Book): Book {
        return bookRep.save(book)
    }

    @Transactional
    fun delete(id: Long) {
        bookRep.deleteById(id)
    }


}