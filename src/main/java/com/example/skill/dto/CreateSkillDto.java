package com.example.skill.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateSkillDto(
    @NotBlank(message = "'name' é obrigatório")
    String name, 

    @NotNull(message = "'xpPerHour' é obrigatório")
    Integer xpPerHour
) {}