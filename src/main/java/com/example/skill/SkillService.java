package com.example.skill;

import java.util.List;

import com.example.skill.dto.CreateSkillDto;
import com.example.skill.exception.SkillNotFoundException;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SkillService {
    
    public List<Skill> listAll() {
        return Skill.listAll();
    }

    public Skill getById(Long id) {

        Skill skill = (Skill) Skill.findByIdOptional(id)
            .orElseThrow(() -> new SkillNotFoundException(id));

        return skill;
    }

    public Skill create(CreateSkillDto createSkillDto) {
        Skill skill = new Skill();
        skill.name = createSkillDto.name();
        skill.xpPerHour = createSkillDto.xpPerHour();
        skill.persist();
        return skill;
    }

    public void delete(Long id) {
        Skill skill = (Skill) Skill.findByIdOptional(id)
            .orElseThrow(() -> new SkillNotFoundException(id));
        
        skill.delete();
    }

}
