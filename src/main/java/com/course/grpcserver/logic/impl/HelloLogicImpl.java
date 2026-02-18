package com.course.grpcserver.logic.impl;

import org.springframework.stereotype.Service;

import com.course.grpcserver.logic.HelloLogic;

@Service
public class HelloLogicImpl implements HelloLogic {

    @Override
    public String generateHello(String name) {
        return "Hello, " + name + "!";
    }

}
