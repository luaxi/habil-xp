package com.example.skill.exception;

import java.util.Map;

import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class SkillExceptionMapper implements ExceptionMapper<SkillException> {

    @Override
    public Response toResponse(SkillException exception) {
      
        if (exception instanceof SkillNotFoundException e){
            return build(Response.Status.NOT_FOUND, e.getMessage());
        }

        return build(Response.Status.INTERNAL_SERVER_ERROR, "Ocorreu um erro inesperado");
    }

    private Response build(Response.Status status, String message) {
        return Response
            .status(status)
            .entity(Map.of("error", message))
            .type(MediaType.APPLICATION_JSON)
            .build();
    }
    
}
