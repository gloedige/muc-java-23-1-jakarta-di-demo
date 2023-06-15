package de.neuefische.mucjava231jakartadidemo.controller;

import de.neuefische.mucjava231jakartadidemo.model.Cat;
import de.neuefische.mucjava231jakartadidemo.service.CatService;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/cats")
public class CatController {

    private final CatService catService;

    @Inject
    public CatController(CatService catService) {
        this.catService = catService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cat> getAllCats(){
        return catService.getAllCats();
    }

    // in spring = @GetMapping("{id})
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Cat getCatById(@PathParam("id") String id){
        return catService.getCatById(id);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Cat addCat(@Valid Cat cat){
        return catService.addCat(cat);
    }
}
