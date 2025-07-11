package com.veterinaria.demo.model.dto.procedure;

import com.veterinaria.demo.enums.ProcedureType;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
public record ProcedureResponseDTO(
        Long id,
        ProcedureType type,
        LocalDateTime date,
        BigDecimal price,
        String description,
        AnimalDTO animal,
        UserDTO veterinarian
) {

    @Builder
    public record AnimalDTO(
            Long id,
            String name
    ) {}

    @Builder
    public record UserDTO(
            Long id,
            String name,
            String crmv_number
    ) {}
}
