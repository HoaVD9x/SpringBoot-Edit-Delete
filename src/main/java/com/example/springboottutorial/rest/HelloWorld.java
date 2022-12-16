package com.example.springboottutorial.rest;

import com.example.springboottutorial.dao.AttemptsRepository;
import com.example.springboottutorial.model.Attempts;
import com.example.springboottutorial.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorld {
//    private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);
//    @Value("${spring.application.name}")
//    private String applicationName;
//
//    @Autowired
//    private AttemptsRepository attemptsRepository;
//
//    @GetMapping(value = "/greeting")
//    public List<Attempts> greeting(){
//        logger.info("Application name >>>>> {}", applicationName);
//        return attemptsRepository.findAll();
//    }
}
