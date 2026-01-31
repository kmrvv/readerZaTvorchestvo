package com.book.readerZaTvorchestvo.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.OffsetDateTime

@Entity
@Table(name = "book_rating")
class BookRating (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(name = "book_id")
    var bookId: Long,

    @Column(name = "rating")
    var rating: Int = 0,

    @Column(name = "users_count_comment")
    var usersCountComment: Int = 0,

    @CreationTimestamp
    @Column(name = "created_at")
    val createdAt: OffsetDateTime? = null,

    @UpdateTimestamp
    @Column(name = "updated_at")
    val updatedAt: OffsetDateTime? = null
)