package org.testproject.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.testproject")
public class AppConfig {

//     @Bean
// //    @Scope("singleton")
//     public Alien alien(/*@Qualifier("desktop")*/ Computer com) {
//         Alien ob = new Alien();
//         ob.setAge(24);
//         ob.setCom(com);
//         return ob;
//     }

//     @Bean
//     @Primary
//     public Desktop desktop() {
//         return new Desktop();
//     }

//     @Bean
//     public Laptop laptop(){
//         return new Laptop();
//     }
}
