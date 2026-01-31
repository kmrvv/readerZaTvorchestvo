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
@Table(name = "users")
class User (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(name = "role")
    var role: String = Role.USER.name,

    @Column(name = "username", nullable = false, length = 50)
    var username: String,

    @Column(name = "email", nullable = false, unique = true, length = 100)
    var email: String,

    @Column(name = "password", nullable = false, length = 255)
    var password: String,

    @CreationTimestamp
    @Column(name = "created_at")
    val createdAt: OffsetDateTime? = null,

    @UpdateTimestamp
    @Column(name = "updated_at")
    val updatedAt: OffsetDateTime? = null
)