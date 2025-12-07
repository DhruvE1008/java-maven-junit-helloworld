package com.example.javamavenjunithelloworld;

/**
 * Main application class that orchestrates the flow.
 */
public class Application {
    
    /**
     * The main method of this program.
     *
     * @param args Arguments passed to this program.
     */
    public static void main(String[] args) {
        int times = Configuration.DEFAULT_TIMES;
        if (args.length >= 1) {
            try {
                times = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("I don't understand the parameter you passed me. Is it a number? " +
                        "Parameter was: [" + args[0] + "]");
                System.exit(Configuration.EXIT_STATUS_PARAMETER_NOT_UNDERSTOOD);
            }
        }

        HelloService helloService = new HelloServiceImpl();
        try {
            helloService.setTimes(times);
            helloService.sayHello(System.out);
        } catch (IllegalArgumentException e) {
            System.err.println("Something went wrong: " + e.getMessage());
            System.exit(Configuration.EXIT_STATUS_HELLO_FAILED);
        }
    }
}