package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launcher {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HotelConfiguration.class);
        Hotel hotel = context.getBean(Hotel.class);
        hotel.welcome();
        context.close();
    }
}
