package com.personal.library.dtos;
import java.math.BigDecimal;

public record FineRequestDto(Long loanId, BigDecimal amount, String reason) {
    
}
