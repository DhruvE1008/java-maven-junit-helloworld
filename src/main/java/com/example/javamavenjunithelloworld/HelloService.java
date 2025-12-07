package com.example.javamavenjunithelloworld;

/**
 * Interface defining the contract for Hello functionality.
 */
public interface HelloService {
    /**
     * Set how many times "Hello!" should be said.
     *
     * @param times How many times should this class say "Hello!"? The value should be no larger than 20.
     * @throws IllegalArgumentException Thrown when times is larger than 20 or a negative number.
     */
    void setTimes(int times);

    /**
     * Say "Hello!".
     *
     * @param printer PrintStream to write output to.
     */
    void sayHello(java.io.PrintStream printer);
}