package com.example.productservice.controllers;


import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/sample")
public class SampleController {

    //{domain-name}/product/{id}
    @GetMapping("/sayHello/{name}")
    public String getProduct(@PathVariable("name") String name) {

        String s = null;
       // Optional<String> name = Optional.ofNullable(s);
        return "Hello World "+name;


    }

    @GetMapping("/sayHello2")
    public String getProduct2(@RequestParam("x") int x) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<5;i++){
            sb.append("hello\n");
        }
        return "Hello ,Tata byebye "+ x;
    }

    @DeleteMapping("/sayHello2")
    public String getProduct3() {
        return "Hello , this is to delete";
    }
}
