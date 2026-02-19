package com.personal.library.entities;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "books")
@Data @NoArgsConstructor @AllArgsConstructor @Builder 
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "release_date", nullable = false)
    private LocalDate releaseDate;
    @Column(name = "status", nullable = false)
    private boolean status;
    @ManyToMany
    @JoinTable(
        name = "book_authors",
        joinColumns = @JoinColumn(name = "book_id"),
        inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    @ToString.Exclude
    private List<Author> authors;
}
