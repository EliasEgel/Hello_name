package com.example.hello_name.Controllers;

import com.example.hello_name.Models.Message;
import com.example.hello_name.Services.GreetingsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/HelloName")
public class GreetingController {
    private final GreetingsService greetingsService = new GreetingsService();

    @GetMapping("/DefaultGreeting")
    public String defaultGreeting(){
        return greetingsService.defaultGreeting();
    }

    //http://localhost:8080/HelloName/CustomGreeting/InputName
    @GetMapping("/CustomGreeting/{input}")
    public String customGreeting(@PathVariable("input") String input){
        return greetingsService.customGreeting(input);
    }
    @GetMapping("/conflicthandler")
    public String conflictHandler(){
        return("This the conflict that needs to be resolved");
    }
}
