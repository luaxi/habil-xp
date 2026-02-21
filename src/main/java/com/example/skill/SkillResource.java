package com.example.skill;

import java.util.List;

import com.example.skill.dto.CreateSkillDto;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/skills")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SkillResource {
    
    @Inject
    SkillService skillService;

    @GET
    public List<Skill> listAll() {
        return skillService.listAll();
    }

    @GET
    @Path("/{id}")
    public Response getById(@PathParam("id") Long id) {
        return Response.ok(skillService.getById(id)).build();
    }

    @POST
    @Transactional
    public Response create(@Valid CreateSkillDto createSkillDto) {
        Skill skill = skillService.create(createSkillDto);
    
        return Response.status(Response.Status.CREATED).entity(skill).build();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public Response delete(@PathParam("id") Long id) {
        skillService.delete(id);
        return Response.noContent().build();
    }

}
