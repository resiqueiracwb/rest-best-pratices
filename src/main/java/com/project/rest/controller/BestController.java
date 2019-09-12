package com.project.rest.controller;

import com.project.rest.model.Predio;
import com.project.rest.service.IDataBasesServices;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@RestController
@Api(value = "BestController")
public class BestController {

    @Autowired
    private IDataBasesServices dataBasesServices;


    @GET
    @Path("/predios")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Best Practices for GET Implementation")
    public List<Predio> getCliente() {

        return this.dataBasesServices.getAllPredio();
    }

    @POST
    @Path("/predios")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Best Practices for POST Implementation")
    public Predio add(Predio predio) {

        if (predio.getName() == null || predio.getName().trim().equals("")) {
            throw new WebApplicationException(Response
                    .status(Response.Status.BAD_REQUEST)
                    .entity("O nome do predio é obrigatório").build());
        }


        return this.dataBasesServices.save(predio);
    }

    @PUT
    @Path("/predios")
    @Consumes(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Best Practices for PUT Implementation")
    public void update(@PathParam("id") Integer id, Predio predio) {
        predio.setId(id);
        this.dataBasesServices.save(predio);
    }

    @DELETE
    @Path("/predios")
    @ApiOperation(value = "Best Practices for DELETE Implementation")
    public void delete(@PathParam("id") Integer id) {
        this.dataBasesServices.delete(id);
    }


}
