package com.example.di_ioc_spring.exem;

import org.springframework.stereotype.Component;

import java.io.*;

@Component("printToFile")
public class PrintToFile implements Print{
    @Override
    public void print(String text) {
        try(BufferedWriter write = new BufferedWriter(new FileWriter("test.txt"))) {
            write.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
