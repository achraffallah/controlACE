package com.example.controlacefellah.dao.repositories;

import com.example.controlacefellah.dao.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepositoy extends JpaRepository<Book,Long> {
    public List<Book> findByTitre( String title);

}
