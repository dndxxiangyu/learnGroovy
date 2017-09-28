package javaR.chapter10;

import groovyR.chapter10.AGroovyClass;

public class Test10_5 {
    public static void main(String[] args) {
        AGroovyClass instance = new AGroovyClass();
        Object result = instance.useClosure(new Object() {
            public String call() {
                return "you called from groovy!";
            }
        });
        System.out.println("received: " + result);
    }
}
