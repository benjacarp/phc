package utn.frt.capitalhumano.PHC.persistencia;

import utn.frt.capitalhumano.PHC.dominio.Usuario;

import java.util.List;

public interface UsuarioRepositoryMemory {
    List<Usuario> getAll();

    void save(Usuario usuario);

    void delete(int id) throws Exception;

    Usuario findById(int id);

    void update(Usuario usuario, int id) throws Exception;
}
