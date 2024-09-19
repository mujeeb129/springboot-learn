package org.testproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testproject.config.AppConfig;

public class JavaBasedConfiguration {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Alien ob = context.getBean(Alien.class);
        System.out.println(ob.getAge());
        ob.code();

        /* for testing scope - change scope in AppConfig.class */
//        Alien ob2 = (Alien) context.getBean("comp2");
    }
}
