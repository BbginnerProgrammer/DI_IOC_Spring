package com.example.di_ioc_spring.exem;


import org.springframework.stereotype.Component;

@Component("printToConsole")
public class PrintToConsole implements Print{

    @Override
    public void print(String text) {
        System.out.println(text.toString());
    }
}
