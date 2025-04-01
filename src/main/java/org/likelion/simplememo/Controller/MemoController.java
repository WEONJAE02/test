package org.likelion.simplememo.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MemoController {

    @GetMapping("/api/hello")
    public String hello(){return "Hello World";}
}
