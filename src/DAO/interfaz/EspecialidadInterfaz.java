package DAO.interfaz;
import entity.Especialidad;
import java.util.List;

public interface EspecialidadInterfaz {
    String agregarEspecialidad(Especialidad especialidad);
    Especialidad obtenerEspecialidad(int id);
    String actualizarEspecialidad(Especialidad especialidad);
    String eliminarEspecialidad(int id);
    List<Especialidad> listarEspecialidades();
}
