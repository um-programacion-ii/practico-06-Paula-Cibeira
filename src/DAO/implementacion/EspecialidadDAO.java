package DAO.implementacion;

import DAO.interfaz.EspecialidadInterfaz;
import entity.Especialidad;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class EspecialidadDAO implements EspecialidadInterfaz {
    private static EspecialidadDAO instance;
    private Map<Integer, Especialidad> especialidades;

    private EspecialidadDAO() {
        especialidades = new HashMap<>();
    }

    //uso el patron singleton
    public static EspecialidadDAO getInstance() {
        if (instance == null) {
            instance = new EspecialidadDAO();
        }
        return instance;
    }

    @Override
    public String agregarEspecialidad(Especialidad especialidad) {
        especialidades.put(especialidad.getId(), especialidad);
        return "La especialidad fue agregada correctamente";
    }

    @Override
    public Especialidad obtenerEspecialidad(int id) {
        return especialidades.get(id);
    }
    @Override
    public String actualizarEspecialidad(Especialidad especialidad) {
        especialidades.put(especialidad.getId(), especialidad);
        return "La especialidad fue actualizada correctamente";
    }

    @Override
    public String eliminarEspecialidad(int id) {
        especialidades.remove(id);
        return "La especialidad fue eliminada correctamente";
    }

    @Override
    public List<Especialidad> listarEspecialidades() {
        return new ArrayList<>(especialidades.values());
    }

}
