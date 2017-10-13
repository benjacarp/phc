package utn.frt.capitalhumano.PHC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import utn.frt.capitalhumano.PHC.dominio.Requerimiento;
import utn.frt.capitalhumano.PHC.service.RequerimientoService;

import java.util.List;

@RestController
@RequestMapping("/requerimiento")
public class RequerimientoController {
    @Autowired
    private RequerimientoService service;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Requerimiento> getAll() {
        return service.getAllRequerimientos();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Requerimiento get(@PathVariable int id) {
        return service.getRequerimientoById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public String create(@RequestBody Requerimiento requerimiento) {
        return service.save(requerimiento);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public String modify(@PathVariable int id, @RequestBody Requerimiento requerimiento) {
        return service.update(requerimiento, id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable int id) {
        return service.delete(id);
    }
}
