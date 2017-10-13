package utn.frt.capitalhumano.PHC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import utn.frt.capitalhumano.PHC.dominio.Requerimiento;
import utn.frt.capitalhumano.PHC.persistencia.RequerimientoRepositoryMemory;

import java.util.List;

@Component
public class RequerimientoService {
    @Autowired
    private RequerimientoRepositoryMemory repository;

    public List<Requerimiento> getAllRequerimientos() {
        return repository.getAll();
    }

    public String save(Requerimiento requerimiento) {
        repository.save(requerimiento);
        return "requerimiento creado";
    }

    public String delete(int id) {
        try {
            repository.delete(id);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "Borrado exitoso";
    }

    public Requerimiento getRequerimientoById(int id) {
        return repository.findById(id);
    }

    public String update(Requerimiento requerimiento, int id) {
        try {
            repository.update(requerimiento, id);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "modificacion exitosa";
    }
}
