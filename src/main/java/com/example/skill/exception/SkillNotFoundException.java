package com.example.skill.exception;

public class SkillNotFoundException extends SkillException {

    public SkillNotFoundException(Long id) {
        super("Skill não encontrada com id: " + id);
    }
    
}
