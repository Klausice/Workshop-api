package com.thiago.grud.crud_api.controllers;

import com.thiago.grud.crud_api.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Usercontroller {
    @GetMapping
    public ResponseEntity<String> getUser(){
        return ResponseEntity.ok("Sucesso!");
    }
}
