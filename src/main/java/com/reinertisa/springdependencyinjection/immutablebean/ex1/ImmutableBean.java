package com.reinertisa.springdependencyinjection.immutablebean.ex1;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "my.bean")
public final class ImmutableBean {
    private final String property1;
    private final int property2;

    public ImmutableBean(String property1, int property2) {
        this.property1 = property1;
        this.property2 = property2;
    }

    public String getProperty1() {
        return property1;
    }

    public int getProperty2() {
        return property2;
    }

    public void show() {
        System.out.println("property-1 -> " + property1);
        System.out.println("property-2 -> " + property2);
    }
}
