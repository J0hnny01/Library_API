package com.personal.library.mappers;

import com.personal.library.dtos.EmployeeRequestDto;
import com.personal.library.dtos.EmployeeResponseDto;
import com.personal.library.entities.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
    Employee toEntity(EmployeeRequestDto dto);
    EmployeeResponseDto toResponseDto(Employee employee);
}