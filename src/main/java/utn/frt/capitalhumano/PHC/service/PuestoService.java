package utn.frt.capitalhumano.PHC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import utn.frt.capitalhumano.PHC.dominio.Puesto;
import utn.frt.capitalhumano.PHC.persistencia.PuestoRepositoryMemory;

import java.util.List;

@Component
public class PuestoService {
    @Autowired
    private PuestoRepositoryMemory repository;

    public List<Puesto> getAllPuestos() {
        return repository.getAll();
    }

    public String save(Puesto puesto) {
        repository.save(puesto);
        return "puesto creado";
    }

    public String delete(int id) {
        try {
            repository.delete(id);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "Borrado exitoso";
    }

    public Puesto getPuestoById(int id) {
        return repository.findById(id);
    }

    public String update(Puesto puesto, int id) {
        try {
            repository.update(puesto, id);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "modificacion exitosa";
    }
}
