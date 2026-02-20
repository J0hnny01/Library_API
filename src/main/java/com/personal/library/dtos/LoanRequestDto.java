package com.personal.library.dtos;

public record LoanRequestDto(Long bookId, Long employeeId, Long clientId, Integer loanDurationDays) {
    
}
