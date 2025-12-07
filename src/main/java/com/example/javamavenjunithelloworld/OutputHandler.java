package com.example.javamavenjunithelloworld;

/**
 * Interface defining how messages are displayed.
 */
public interface OutputHandler {
    /**
     * Display a message.
     *
     * @param message The message to display.
     */
    void display(String message);
}