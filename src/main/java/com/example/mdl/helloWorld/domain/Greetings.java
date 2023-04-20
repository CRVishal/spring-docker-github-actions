package com.example.mdl.helloWorld.domain;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "greeting")
public class Greetings {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "greeting")
    private String greeting;
}
