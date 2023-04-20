package com.example.mdl.helloWorld.controller;

import com.example.mdl.helloWorld.domain.Greetings;
import com.example.mdl.helloWorld.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

@Component
public class HomeController implements CommandLineRunner {

    @Autowired
    private GreetingService service;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.service.getGreeting());
    }

}


