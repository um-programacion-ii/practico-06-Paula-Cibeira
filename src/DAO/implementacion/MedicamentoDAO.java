package DAO.implementacion;

import DAO.interfaz.MedicamentoInterfaz;
import entity.Medicamento;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class MedicamentoDAO implements MedicamentoInterfaz {
    private static MedicamentoDAO instance;
    private Map<Integer, Medicamento> medicamentos;

    private MedicamentoDAO() {
        medicamentos = new HashMap<>();
    }

    //uso el patron singleton
    public static MedicamentoDAO getInstance() {
        if (instance == null) {
            instance = new MedicamentoDAO();
        }
        return instance;
    }

    @Override
    public String agregarMedicamento(Medicamento medicamento) {
        medicamentos.put(medicamento.getId(), medicamento);
        return "El medicamento fue agregado correctamente";
    }

    @Override
    public Medicamento obtenerMedicamento(int id) {
        return medicamentos.get(id);
    }
    @Override
    public String actualizarMedicamento(Medicamento medicamento) {
        medicamentos.put(medicamento.getId(), medicamento);
        return "El medicamento fue actualizado correctamente";
    }

    @Override
    public String eliminarMedicamento(int id) {
        medicamentos.remove(id);
        return "El medicamento fue eliminado correctamente";
    }

    @Override
    public List<Medicamento> listarMedicamentos() {
        return new ArrayList<>(medicamentos.values());
    }


}
