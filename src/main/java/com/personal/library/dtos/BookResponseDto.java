package com.personal.library.dtos;
import java.time.LocalDate;
import java.util.List;

public record BookResponseDto(Long id, String title, LocalDate releaseDate, Boolean isAvailable, List<AuthorResponseDto> authors) {
    
}
