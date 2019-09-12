package com.project.rest.controller;

import com.project.rest.config.BestConfig;
import com.project.rest.model.Predio;
import com.project.rest.service.IDataBasesServices;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "BestController")
public class BestController {

    @Autowired
    private IDataBasesServices dataBasesServices;


    @ApiOperation(value = "Best Practices for Rest Implementation")
    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Predio> hello(@RequestParam(required = false) boolean niteroi) {

        return this.dataBasesServices.getAllPredio();
    }

}
