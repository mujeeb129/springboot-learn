package org.testproject.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.testproject.Alien;
import org.testproject.Computer;
import org.testproject.Desktop;
import org.testproject.Laptop;

@Configuration
public class AppConfig {

    @Bean
//    @Scope("singleton")
    public Alien alien(/*@Qualifier("desktop")*/ Computer com) {
        Alien ob = new Alien();
        ob.setAge(24);
        ob.setCom(com);
        return ob;
    }

    @Bean
    @Primary
    public Desktop desktop() {
        return new Desktop();
    }

    @Bean
    public Laptop laptop(){
        return new Laptop();
    }
}
