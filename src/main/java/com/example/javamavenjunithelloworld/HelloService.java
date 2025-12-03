package com.example.javamavenjunithelloworld;

import java.io.PrintStream;

/**
 * Service class that encapsulates the business logic for saying hello.
 */
public class HelloService {

    private final Hello hello;

    public HelloService() {
        this.hello = new Hello();
    }

    /**
     * Say "Hello!" a specified number of times.
     *
     * @param times How many times should "Hello!" be said?
     * @param printer PrintStream to write output to.
     * @throws IllegalArgumentException Thrown when times is larger than 20 or a negative number.
     */
    public void sayHello(int times, PrintStream printer) {
        hello.setTimes(times);
        hello.sayHello(printer);
    }

    /**
     * Say "Hello!" with the default number of times.
     *
     * @param printer PrintStream to write output to.
     */
    public void sayHello(PrintStream printer) {
        sayHello(Hello.DEFAULT_TIMES, printer);
    }
}