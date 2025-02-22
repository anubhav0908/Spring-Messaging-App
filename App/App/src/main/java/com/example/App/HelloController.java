package com.example.App;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @RequestMapping("/UC1")
    public String Hello() {
        return "Hello From BridgeLabz";
    }

}
