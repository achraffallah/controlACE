package com.example.controlacefellah.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
    @Id
    @GeneratedValue
    private long id_Book ;
    private String titre;
    private String publisher;
    private Date datePublication;
    private Double price;
    private String resume;

}
