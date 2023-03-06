package com.example.di_ioc_spring.comandLine;

import com.example.di_ioc_spring.exem.Print;
import com.example.di_ioc_spring.exem.Text;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("custom")
public class commandLine implements CommandLineRunner {

    private final Print print;

    public commandLine(@Qualifier("printToConsole") Print print, Text text) {
        this.print = print;
    }

    @PostConstruct
    private void postConstruct() {
        System.out.println("post construct example");
    }

    @Override
    public void run(String... args) throws Exception {
        print.print("Success Autowired");
    }
}
