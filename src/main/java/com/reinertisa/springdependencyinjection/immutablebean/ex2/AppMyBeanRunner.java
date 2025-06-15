package com.reinertisa.springdependencyinjection.immutablebean.ex2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppMyBeanRunner implements CommandLineRunner {

    private final MyBean myBean1;
    private final MyBean myBean2;

    public AppMyBeanRunner(MyBean myBean1, MyBean myBean2) {
        this.myBean1 = myBean1;
        this.myBean2 = myBean2;
    }

    @Override
    public void run(String... args) throws Exception {

        if (myBean1 == myBean2) {
            System.out.println("MyBean1 and MyBean2 are the same");
        } else {
            System.out.println("MyBean1 and MyBean2 are not the same");
        }
    }
}
