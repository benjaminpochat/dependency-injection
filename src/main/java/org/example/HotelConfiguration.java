package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class HotelConfiguration {
    @Bean
    public ReceptionDesk receptionDesk() {
        //return new EnglishReceptionDesk();
        return new FrenchReceptionDesk();
    }
}
