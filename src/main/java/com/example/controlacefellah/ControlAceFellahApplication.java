package com.example.controlacefellah;

import com.example.controlacefellah.dto.BookDTO;
import com.example.controlacefellah.services.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class ControlAceFellahApplication {

    public static void main ( String[] args ) {
        SpringApplication.run ( ControlAceFellahApplication.class , args );
    }
    @Bean
    CommandLineRunner start( BookService bookService) {
        return args -> {
            bookService.saveBook ( BookDTO.builder ( ).titre ( "holla" ).publisher ( "hello" ).datePublication ( new Date () ).price ( 155.).resume ("hellof00" ).build () );
            bookService.saveBook ( BookDTO.builder ( ).titre ( "holla1" ).publisher ( "hello" ).datePublication ( new Date () ).price ( 155.).resume ("hellof00" ).build () );
            bookService.saveBook ( BookDTO.builder ( ).titre ( "holla2" ).publisher ( "hello" ).datePublication ( new Date () ).price ( 155.).resume ("hellof00" ).build () );
            bookService.saveBook ( BookDTO.builder ( ).titre ( "holla3" ).publisher ( "hello" ).datePublication ( new Date () ).price ( 155.).resume ("hellof00" ).build () );
        };
    }
}
