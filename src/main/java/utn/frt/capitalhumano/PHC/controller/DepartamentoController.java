package utn.frt.capitalhumano.PHC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import utn.frt.capitalhumano.PHC.dominio.Departamento;
import utn.frt.capitalhumano.PHC.service.DepartamentoService;

import java.util.List;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {
    @Autowired
    private DepartamentoService service;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Departamento> getAll() {
        return service.getAllDepartamentos();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Departamento get(@PathVariable int id) {
        return service.getDepartamentoById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public String create(@RequestBody Departamento departamento) {
        return service.save(departamento);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public String modify(@PathVariable int id, @RequestBody Departamento departamento) {
        return service.update(departamento, id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable int id) {
        return service.delete(id);
    }
}
