package com.example.hello_name.Services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingsServiceTest {
    GreetingsService greetingsService = new GreetingsService();

    @Test
    void defaultGreeting_HelloWord_True() {
        assertEquals(greetingsService.defaultGreeting(),"Hello World!");
    }

    @Test
    void customGreeting_HelloTest_True() {
        assertEquals(greetingsService.customGreeting("Test"),"Hello Test!");
    }
}