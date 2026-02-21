package com.example.skill.dto;

import io.smallrye.common.constraint.NotNull;

public record CreateSkillDto(
    String name, 
    @NotNull Integer xpPerHour
) {}