package com.example.controlacefellah.web;

import com.example.controlacefellah.dao.entities.Book;
import com.example.controlacefellah.dto.BookDTO;
import com.example.controlacefellah.services.BookService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class BookGraphQlController {
    private BookService bookService;
    @MutationMapping
    public BookDTO saveAvion( @Argument BookDTO avion){
        return bookService.saveBook (avion);
    }

    @QueryMapping
    public List<BookDTO> getBookByTitre( @Argument String titre){
        return bookService.getBookByTitle (titre);
    }






}
