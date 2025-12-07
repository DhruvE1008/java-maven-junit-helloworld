package com.example.javamavenjunithelloworld;

/**
 * A very basic program that demonstrates the use of JUnit tests. The tests include a sample unit test and an
 * integration test.
 *
 * @deprecated Use {@link Application} instead.
 */
@Deprecated
public class HelloApp {

    static int DEFAULT_TIMES = 3;

    static int EXIT_STATUS_PARAMETER_NOT_UNDERSTOOD = 2;
    static int EXIT_STATUS_HELLO_FAILED = 4;

    /**
     * The main method of this program.
     *
     * @param args Arguments passed to this program.
     */
    public static void main(String[] args) {
        System.err.println("Warning: HelloApp is deprecated. Please use Application instead.");
        Application.main(args);
    }

}
