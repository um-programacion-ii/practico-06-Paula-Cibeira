package DAO.implementacion;

import DAO.interfaz.MedicoInterfaz;
import entity.Medico;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class MedicoDAO implements MedicoInterfaz {
    private static MedicoDAO instance;
    private Map<Integer, Medico> medicos;

    private MedicoDAO() {
        medicos = new HashMap<>();
    }

    //uso el patron singleton
    public static MedicoDAO getInstance() {
        if (instance == null) {
            instance = new MedicoDAO();
        }
        return instance;
    }
    @Override
    public String agregarMedico(Medico medico) {
        medicos.put(medico.getId(), medico);
        return "Medico agregado con exito";
    }

    @Override
    public Medico obtenerMedico(int id) {
        return medicos.get(id);
    }

    @Override
    public String actualizarMedico(Medico medico) {
        medicos.put(medico.getId(), medico);
        return "Medico actualizado con exito";
    }

    @Override
    public String eliminarMedico(int id) {
        medicos.remove(id);
        return "Medico eliminado con exito";
    }

    @Override
    public List<Medico> listarMedicos() {
        return new ArrayList<>(medicos.values());
    }

}
