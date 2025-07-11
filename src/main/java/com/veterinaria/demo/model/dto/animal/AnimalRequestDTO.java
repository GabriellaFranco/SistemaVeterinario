package com.veterinaria.demo.model.dto.animal;

import com.veterinaria.demo.enums.AnimalSpecies;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Builder;

@Builder
public record AnimalRequestDTO(

        @Size(min = 2)
        @NotNull
        String name,

        @NotNull
        AnimalSpecies species,

        @NotNull
        String breed,

        @Positive
        @NotNull
        Long age,

        @NotNull
        Long tutorId
) {
}
