package utn.frt.capitalhumano.PHC.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaController {

    @RequestMapping("/hello/{nombre}")
    public String helloWorld(@PathVariable String nombre) {
        return "Hello " + nombre;
    }

    @RequestMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }

}
