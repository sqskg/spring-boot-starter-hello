package com.ting.spring.boot.starter;

import com.ting.spring.boot.lianxi.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootStarter {

    @Autowired
    HelloService helloService;


    @RequestMapping("/")
    public String index(){
        return helloService.sayHello();
    }
    public static void main(String[] args){

        SpringApplication.run(SpringBootStarter.class,args);
    }
}
