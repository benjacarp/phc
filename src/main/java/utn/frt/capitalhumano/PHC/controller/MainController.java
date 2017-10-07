package utn.frt.capitalhumano.PHC.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String api() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("GET :: https://capitalphc.herokuapp.com/departamento/")
                .append("\n")
                .append("trae todos los departamentos.")
                .append("\n")
                .append("\n")
                .append("GET :: https://capitalphc.herokuapp.com/departamento/{id}")
                .append("\n")
                .append("trae el departamento por id.")
                .append("\n")
                .append("\n")
                .append("POST :: https://capitalphc.herokuapp.com/departamento/")
                .append("\n")
                .append("Crea el departamento. Hay que mandarlo como JSON: " +
                        "{\n" +
                        "\t\"nombre\" : \"departamento groso\"\n" +
                        "}")
                .append("\n")
                .append("\n")
                .append("DELETE :: https://capitalphc.herokuapp.com/departamento/{id}")
                .append("\n")
                .append("Borra el departamento por id.")
                .append("\n")
                .append("\n")
        ;

        return stringBuilder.toString();
    }
}
