package com.personal.library.entities;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "authors")
@Data @NoArgsConstructor @AllArgsConstructor @Builder 
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "last_name", nullable = false)
    private String lastName;
}
