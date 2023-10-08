package org.aman.graphql.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="project_book")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String authorName;
    private double price;
    private int pages;
}
