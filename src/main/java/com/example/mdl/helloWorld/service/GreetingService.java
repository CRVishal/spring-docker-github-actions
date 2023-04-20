package com.example.mdl.helloWorld.service;

import com.example.mdl.helloWorld.domain.Greetings;
import com.example.mdl.helloWorld.repository.GreetingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GreetingService {

    @Autowired
    private GreetingsRepository repository;


    public String getGreeting() {
        String output = null;
        List<Greetings> greetlist = new ArrayList<>();

        try {
            greetlist = this.repository.findAll();
        } catch (Exception e) {
            e.getMessage();
        }

        if (greetlist.isEmpty()) {
            Greetings greet = new Greetings();
            greet.setGreeting("Hello");
            Greetings savedGreet = this.repository.save(greet);
            return savedGreet.getGreeting()+" World";

        } else {
            Greetings greet = greetlist.get(0);
            output = greet.getGreeting() + " World";
        }
        return output;
    }
}
