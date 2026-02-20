package com.personal.library.mappers;
import com.personal.library.dtos.AuthorRequestDto;
import com.personal.library.dtos.AuthorResponseDto;
import com.personal.library.entities.Author;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuthorMapper {
    Author toEntity(AuthorRequestDto dto);
    AuthorResponseDto toResponseDto(Author author);
}
