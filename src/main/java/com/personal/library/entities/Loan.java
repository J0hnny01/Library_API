package com.personal.library.entities;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "loans")
@Data @NoArgsConstructor @AllArgsConstructor @Builder 
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loan_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;
    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;
    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;
    @Column(name = "loan_date", nullable = false)
    private LocalDate loanDate;
    @Column(name = "due_date", nullable = false)
    private LocalDate dueDate;
    @Column(name = "return_date") 
    private LocalDate returnDate;
}