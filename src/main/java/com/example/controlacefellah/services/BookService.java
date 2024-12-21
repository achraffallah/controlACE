package com.example.controlacefellah.services;

import com.example.controlacefellah.dto.BookDTO;

import java.util.List;

public interface BookService {

    public List<BookDTO> getBookByTitle(String title);
    public BookDTO saveBook(BookDTO bookDTO);
    public boolean deletebook(Double id);
}
