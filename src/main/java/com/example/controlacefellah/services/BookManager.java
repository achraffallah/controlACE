package com.example.controlacefellah.services;

import com.example.controlacefellah.dao.entities.Book;
import com.example.controlacefellah.dao.repositories.BookRepositoy;
import com.example.controlacefellah.dto.BookDTO;
import com.example.controlacefellah.mapper.BookMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
public class BookManager implements BookService{
    private BookMapper bookMapper;
    private BookRepositoy bookRepositoy;

    @Override
    public List<BookDTO> getBookByTitle ( String title ) {
        List<Book> books = bookRepositoy.findByTitre (title);
        List<BookDTO> bookDtos = new ArrayList<> ();
        for (Book avion : books) {
            bookDtos.add(bookMapper.fromBookToBookDto (avion));
        }
        return bookDtos;
    }

    @Override
    public BookDTO saveBook ( BookDTO bookDTO ) {
        Book book =bookMapper.fromBookDtoToBook ( bookDTO );
        bookRepositoy.save( book );
        bookDTO = bookMapper.fromBookToBookDto ( book );
        return bookDTO;

    }

    @Override
    public boolean deletebook ( Double id ) {
        return false;
    }
}
