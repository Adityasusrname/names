package com.example.names.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NamesController {
     @GetMapping("/hello")
    public String hello(@RequestParam(value="name",defaultValue="Aditya") String name){
         return String.format("Hello %s!",name);
     }

     @GetMapping("/reverse")
    public String reverse(@RequestParam(value="name",defaultValue="Aditya")String name){
         String reversedName = "";
         for(int i=(name.length()-1); i>=0;i--){
             reversedName = reversedName + name.charAt(i);
         }
         return String.format("Reversed name in lower case-> %s",reversedName.toLowerCase());
     }

     @GetMapping("/sayIamCute")
    public String sayIamCute(@RequestParam(value="name",defaultValue = "Aditya")String name){
         return String.format("You are cute %s",name+":-)");
     }

}

