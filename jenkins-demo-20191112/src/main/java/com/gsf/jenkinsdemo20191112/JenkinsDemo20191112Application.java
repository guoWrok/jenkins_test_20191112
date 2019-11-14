package com.gsf.jenkinsdemo20191112;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JenkinsDemo20191112Application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(JenkinsDemo20191112Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(JenkinsDemo20191112Application.class, args);
    }

}
