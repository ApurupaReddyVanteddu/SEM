package com.klef.jfsd.examm;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.examm.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
