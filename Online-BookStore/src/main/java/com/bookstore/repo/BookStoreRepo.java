package com.bookstore.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.entity.BookStore;
@Repository
public interface BookStoreRepo extends JpaRepository<BookStore, Long> {

}
