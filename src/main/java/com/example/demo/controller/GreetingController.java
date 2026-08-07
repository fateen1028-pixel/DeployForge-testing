package com.example.demo.controller;
import com.example.demo.service.GreetingService;
import org.springframework.web.bind.annotation.*;
@RestController
public class GreetingController{
private final GreetingService service;
public GreetingController(GreetingService service){this.service=service;}
@GetMapping("/")
public String hello(){return service.message();}
}