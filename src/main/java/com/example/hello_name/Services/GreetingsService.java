package com.example.hello_name.Services;

public class GreetingsService {

    public String defaultGreeting(){
        return "Hello World!";
    }

    public String customGreeting(String input) {
        return "Hello " +input+"!";
    }
}
