package DAO.implementacion;
import entity.Turno;

import DAO.interfaz.TurnoInterfaz;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class TurnoDAO implements TurnoInterfaz {
    private static TurnoDAO instance;
    private Map<Integer, Turno> turnos;

    public TurnoDAO() {
        turnos = new HashMap<>();
    }
    //uso el patron singleton
    public static TurnoDAO getInstance() {
        if (instance == null) {
            instance = new TurnoDAO();
        }
        return instance;
    }

    @Override
    public String agregarTurno(Turno turno) {
        turnos.put(turno.getId(), turno);
        return "El turno fue agregado correctamente";
    }

    @Override
    public Turno obtenerTurno(int id) {
        return turnos.get(id);
    }
    @Override
    public String actualizarTurno(Turno turno) {
        turnos.put(turno.getId(), turno);
        return "El paciente fue actualizado correctamente";
    }

    @Override
    public String eliminarTurno(int id) {
        turnos.remove(id);
        return "El paciente fue eliminado correctamente";
    }

    @Override
    public List<Turno> listarTurnos() {
        return new ArrayList<>(turnos.values());
    }

    @Override
    public String verEstadoTurno(int id) {
        Turno turno = turnos.get(id);
        boolean estadoTurno = turno.isEstadoTurno();
        String estado = null;
        if (estadoTurno) {
            estado = "El turno terminó";
        }
        else {
            estado = "El turno está activo";
        }
        return estado;
    }

}
