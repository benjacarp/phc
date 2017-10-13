package utn.frt.capitalhumano.PHC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import utn.frt.capitalhumano.PHC.dominio.Nivel;
import utn.frt.capitalhumano.PHC.persistencia.NivelRepositoryMemory;

import java.util.List;

@Component
public class NivelService {
    @Autowired
    private NivelRepositoryMemory repository;

    public List<Nivel> getAllNiveles() {
        return repository.getAll();
    }

    public String save(Nivel nivel) {
        repository.save(nivel);
        return "nivel creado";
    }

    public String delete(int id) {
        try {
            repository.delete(id);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "Borrado exitoso";
    }

    public Nivel getNivelById(int id) {
        return repository.findById(id);
    }

    public String update(Nivel nivel, int id) {
        try {
            repository.update(nivel, id);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "modificacion exitosa";
    }
}
