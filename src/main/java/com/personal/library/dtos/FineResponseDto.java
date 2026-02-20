package com.personal.library.dtos;
import java.math.BigDecimal;

public record FineResponseDto(Long id, Long loanId, BigDecimal amount, String reason) {
    
}
