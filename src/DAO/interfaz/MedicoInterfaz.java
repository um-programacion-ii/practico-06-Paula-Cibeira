package DAO.interfaz;
import entity.Medico;
import java.util.List;

public interface MedicoInterfaz {
    String agregarMedico(Medico medico);
    Medico obtenerMedico(int id);
    String actualizarMedico(Medico medico);
    String eliminarMedico(int id);
    List<Medico> listarMedicos();

}
