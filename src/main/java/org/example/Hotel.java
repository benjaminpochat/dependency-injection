package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

@Component
public class Hotel {
    private ReceptionDesk receptionDesk;

    @Inject
    Hotel(ReceptionDesk receptionDesk) {
        this.receptionDesk = receptionDesk;
    }

    @PostConstruct
    public void openTheDoors() {
        System.out.println("Opening hotel's doors");
    }

    @PreDestroy
    public void closeTheDoors() {
        System.out.println("Closing hotel's doors");
    }

    public void welcome() {
        System.out.println(receptionDesk.sayHello());
    }
}
