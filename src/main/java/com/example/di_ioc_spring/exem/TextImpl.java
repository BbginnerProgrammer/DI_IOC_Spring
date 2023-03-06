package com.example.di_ioc_spring.exem;


import org.springframework.stereotype.Component;

@Component
public class TextImpl implements Text{

    String text;

    public TextImpl() {
        this.text = "Text";
    }

    public String getText() {
        return text;
    }
}
