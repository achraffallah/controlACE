package com.example.controlacefellah.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDTO {
    private String titre;
    private String publisher;
    private Date datePublication;
    private Double price;
    private String resume;
}
