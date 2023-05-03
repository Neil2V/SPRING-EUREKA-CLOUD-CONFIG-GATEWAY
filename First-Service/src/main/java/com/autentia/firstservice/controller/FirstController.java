package com.autentia.firstservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class FirstController {

    @GetMapping("/message")
    public String getMessage(){
        return "Obteniendo mensaje del primer servicio";
    }
}
