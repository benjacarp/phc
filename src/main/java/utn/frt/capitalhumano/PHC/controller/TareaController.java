package utn.frt.capitalhumano.PHC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import utn.frt.capitalhumano.PHC.dominio.Tarea;
import utn.frt.capitalhumano.PHC.service.TareaService;

import java.util.List;

@RestController
@RequestMapping("/tarea")
public class TareaController {
    @Autowired
    private TareaService service;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Tarea> getAll() {
        return service.getAllTareas();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Tarea get(@PathVariable int id) {
        return service.getTareaById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public String create(@RequestBody Tarea tarea) {
        return service.save(tarea);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public String modify(@PathVariable int id, @RequestBody Tarea tarea) {
        return service.update(tarea, id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable int id) {
        return service.delete(id);
    }
}
