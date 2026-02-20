package com.personal.library.mappers;
import com.personal.library.dtos.LoanRequestDto;
import com.personal.library.dtos.LoanResponseDto;
import com.personal.library.entities.Loan;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LoanMapper {
    @Mapping(target = "clientName", source = "client.name")
    @Mapping(target = "clientLastName", source = "client.lastName")
    LoanResponseDto toResponseDto(Loan loan);
    @Mapping(target = "book", ignore = true)
    @Mapping(target = "client", ignore = true)
    @Mapping(target = "employee", ignore = true)
    @Mapping(target = "loanDate", ignore = true)
    @Mapping(target = "returnDate", ignore = true)
    @Mapping(target = "dueDate", ignore = true)
    Loan toEntity(LoanRequestDto dto);
}