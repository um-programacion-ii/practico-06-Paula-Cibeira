package DAO.interfaz;
import entity.Turno;
import java.util.List;

public interface TurnoInterfaz {
    String agregarTurno(Turno turno);
    Turno obtenerTurno(int id);
    String actualizarTurno(Turno turno);
    String eliminarTurno(int id);
    String verEstadoTurno(int id);
    List<Turno> listarTurnos();
}
