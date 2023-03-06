package com.example.di_ioc_spring;

import com.example.di_ioc_spring.exem.Print;
import com.example.di_ioc_spring.exem.PrintToConsole;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DiIocSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiIocSpringApplication.class, args);
    }


//    @Bean
//    public Print testBean(){
//        return new PrintToConsole();
//    }

}
