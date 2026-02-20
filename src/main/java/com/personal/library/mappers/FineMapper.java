package com.personal.library.mappers;
import com.personal.library.dtos.FineRequestDto;
import com.personal.library.dtos.FineResponseDto;
import com.personal.library.entities.Fine;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface FineMapper {
    @Mapping(target = "loanId", source = "loan.loanId")
    FineResponseDto toResponseDto(Fine fine);
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "loan", ignore = true) 
    Fine toEntity(FineRequestDto dto);
}