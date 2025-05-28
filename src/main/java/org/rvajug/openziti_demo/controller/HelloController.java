package org.rvajug.openziti_demo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Hello Controller", description = "APIs for greeting messages")
@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @Operation(summary = "Say hello to OpenZiti", description = "Returns a simple hello message.")
    @GetMapping
    public String hello() {
        return "Hello, OpenZiti!";
    }

    @Operation(summary = "Greet a user by name", description = "Returns a personalized greeting message.")
    @GetMapping("/greet")
    public String greet(
            @Parameter(description = "Name of the person to greet", required = true)
            @RequestParam String name) {
        return "Hello, " + name + "!";
    }

}