package org.taesunny.echo;

public class EchoService {
    String createEchoMessage(String message) {
        return "You say " + message + "I say " + message;
    }
}