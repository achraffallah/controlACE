package com.example.controlacefellah.mapper;

import com.example.controlacefellah.dao.entities.Book;
import com.example.controlacefellah.dto.BookDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    private final ModelMapper mapper = new ModelMapper();
    public Book fromBookDtoToBook( BookDTO bookDTO ){
        return mapper.map(bookDTO,Book.class);
    }
    public BookDTO fromBookToBookDto( Book book ){
        return mapper.map(book,BookDTO.class);
    }
}
