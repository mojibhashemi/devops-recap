package no.kristiania.devopsrecap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/")
    public String hello() {
        return "Hello";
    }
    
    @GetMapping("/kaos")
    public String hello2() {
        return "Hello from kaos";
    }


}
