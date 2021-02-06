package de.cretu.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello-world")  // ce se scrie in brauser
    public String sayHello(){
        return "hello_world"; //pagina care se intoarce
    }

    @GetMapping("/test1")
    public String test(){

        return "test1";

    }

}
