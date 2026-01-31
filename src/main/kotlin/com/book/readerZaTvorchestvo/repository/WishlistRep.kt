package com.book.readerZaTvorchestvo.repository

import com.book.readerZaTvorchestvo.model.Wishlist
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface WishlistRep : JpaRepository<Wishlist, Long> {

    fun getByUserId(userId: Long): List<Wishlist>
}