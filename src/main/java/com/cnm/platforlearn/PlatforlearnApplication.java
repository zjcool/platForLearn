package com.cnm.platforlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication(scanBasePackages = "com.cnm")
@ServletComponentScan
public class PlatforlearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatforlearnApplication.class, args);
    }

}
