package com.personal.library.dtos;
import java.time.LocalDate;

public record LoanResponseDto(Long id, String clientName, String clientLastName, LocalDate dueDate) {
    
}
