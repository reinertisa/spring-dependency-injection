package com.reinertisa.springdependencyinjection.immutablebean.ex1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppImmutableBeanRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        ImmutableBean immutableBean1 = new ImmutableBean("hello", 39);
        immutableBean1.show();

        ImmutableBean immutableBean2 = new ImmutableBean("hello", 39);
        immutableBean2.show();

        if (immutableBean1 == immutableBean2) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }

        if (immutableBean1.equals(immutableBean2)) {
            System.out.println("They are equal");
        } else {
            System.out.println("They are not equal");
        }
    }
}
