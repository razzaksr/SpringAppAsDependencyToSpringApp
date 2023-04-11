package com.example.MainSpringJdbcLibExecutor;

import org.example.Hai;
import org.example.serv.Servicing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ComponentScan(value="org.example.serv")
public class Mediator {

    @Autowired
    Servicing servicing;

    @GetMapping("/")
    public List<Hai> call(){
        return servicing.listAll();
    }
}
