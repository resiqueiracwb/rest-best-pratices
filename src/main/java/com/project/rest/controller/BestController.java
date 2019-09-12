package com.project.rest.controller;

import com.project.rest.config.BestConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "BestController")
public class BestController {

    @ApiOperation(value = "Best Practices for Rest Implementation")
    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String hello(@RequestParam(required = false) boolean niteroi) {

        return "greeting";
    }

}
