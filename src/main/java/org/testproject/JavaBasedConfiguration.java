package org.testproject;

import javax.accessibility.AccessibleBundle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class JavaBasedConfiguration {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(JavaBasedConfiguration.class);

        Alien ob = (Alien) context.getBean(Alien.class);

        ob.code();
    }
}
