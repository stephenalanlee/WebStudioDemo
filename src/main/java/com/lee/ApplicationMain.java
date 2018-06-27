package com.lee;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationMain {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ApplicationMain.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
