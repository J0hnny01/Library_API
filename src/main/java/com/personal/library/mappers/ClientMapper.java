package com.personal.library.mappers;
import com.personal.library.dtos.ClientRequestDto;
import com.personal.library.dtos.ClientResponseDto;
import com.personal.library.entities.Client;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    Client toEntity(ClientRequestDto dto);
    ClientResponseDto toResponseDto(Client client);
}
