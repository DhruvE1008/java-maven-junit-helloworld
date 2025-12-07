package com.example.javamavenjunithelloworld;

import java.io.PrintStream;

/**
 * Implementation of the OutputHandler interface for console output.
 */
public class ConsoleOutputHandler implements OutputHandler {
    
    private final PrintStream printStream;

    public ConsoleOutputHandler() {
        this.printStream = System.out;
    }

    public ConsoleOutputHandler(PrintStream printStream) {
        this.printStream = printStream;
    }

    /**
     * Display a message.
     *
     * @param message The message to display.
     */
    @Override
    public void display(String message) {
        printStream.println(message);
    }
}