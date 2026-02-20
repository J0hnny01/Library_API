package com.personal.library.mappers;

import com.personal.library.dtos.BookRequestDto;
import com.personal.library.dtos.BookResponseDto;
import com.personal.library.entities.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {AuthorMapper.class})
public interface BookMapper {
    BookResponseDto toResponseDto(Book book);
    @Mapping(target = "authors", ignore = true)
    Book toEntity(BookRequestDto dto);
}