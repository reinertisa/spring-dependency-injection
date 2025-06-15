package com.reinertisa.springdependencyinjection.immutablebean.ex2;

import org.springframework.stereotype.Component;

@Component
public final class MyBean {
    private final String name = "Isa";

    public String getName() {
        return name;
    }
}
