package utn.frt.capitalhumano.PHC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import utn.frt.capitalhumano.PHC.dominio.Puesto;
import utn.frt.capitalhumano.PHC.service.PuestoService;

import java.util.List;

@RestController
@RequestMapping("/puesto")
public class PuestoController {
    @Autowired
    private PuestoService service;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Puesto> getAll() {
        return service.getAllPuestos();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Puesto get(@PathVariable int id) {
        return service.getPuestoById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public String create(@RequestBody Puesto puesto) {
        return service.save(puesto);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public String modify(@PathVariable int id, @RequestBody Puesto puesto) {
        return service.update(puesto, id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable int id) {
        return service.delete(id);
    }
}
