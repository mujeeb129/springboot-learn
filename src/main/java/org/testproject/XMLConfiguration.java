package org.testproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class XMLConfiguration {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien al = (Alien) context.getBean("alien");
        al.code();
        System.out.println(al.getAge());
    }
}
