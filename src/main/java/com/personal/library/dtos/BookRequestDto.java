package com.personal.library.dtos;
import java.time.LocalDate;
import java.util.List;

public record BookRequestDto(String title, LocalDate releaseDate, Boolean isAvailable, List<Long> authorIds) {
    
}
