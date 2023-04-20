package com.example.mdl.helloWorld.repository;

import com.example.mdl.helloWorld.domain.Greetings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingsRepository extends JpaRepository<Greetings, Integer> {

}
