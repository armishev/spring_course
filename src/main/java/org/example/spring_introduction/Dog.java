package org.example.spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;
import java.sql.SQLOutput;
//@Component
public class Dog implements Pet{

//    private String name;

    public Dog() {
        System.out.println("Dog bean is created!");
    }

    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }

//    @PostConstruct
//    public void init(){
//        System.out.println("Class Dog: init method");
//    }
//
//    @PreDestroy
//    public void destroy(){
//        System.out.println("Class Dog: destroy method");
//    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
