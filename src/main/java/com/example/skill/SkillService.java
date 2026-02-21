package com.example.skill;

import java.util.List;

import com.example.skill.dto.CreateSkillDto;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SkillService {
    
    public List<Skill> listAll() {
        return Skill.listAll();
    }

    public Skill getById(Long id) {
        return Skill.findById(id);
    }

    public Skill create(CreateSkillDto createSkillDto) {
        Skill skill = new Skill();
        skill.name = createSkillDto.name();
        skill.xpPerHour = createSkillDto.xpPerHour();
        skill.persist();
        return skill;
    }

    public boolean delete(Long id) {
        return Skill.deleteById(id);
    }

}
