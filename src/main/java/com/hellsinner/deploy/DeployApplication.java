package com.hellsinner.deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeployApplication {

    @GetMapping("/first")
    public String index(){
        return "first";
    }

    @GetMapping("/second")
    public String second(){
        return "second";
    }

    @GetMapping("/third")
    public String third(){
        return "third";
    }

    @GetMapping("/fourth")
    public String fourth(){
        return "fourth";
    }
    public static void main(String[] args) {
        SpringApplication.run(DeployApplication.class, args);
    }

}
