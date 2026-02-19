package com.personal.library.entities;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "clients")
@Data @NoArgsConstructor @AllArgsConstructor @Builder 
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Long id;
    @Column(name = "cedula", nullable = false, unique = true)
    private String cedula;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "last_name", nullable = false)
    private String lastName;
}
