package DAO.implementacion;

import DAO.interfaz.FarmaciaInterfaz;
import entity.Medicamento;
import entity.Farmacia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FarmaciaDAO implements FarmaciaInterfaz {
    private Map<Integer, Farmacia> medicamentosFarm;

    private FarmaciaDAO() {
        medicamentosFarm = new HashMap<>();
    }

    @Override
    public Farmacia obtenerMedicamentosFarmacia(List<Farmacia> medicamentos) {
        return medicamentosFarm.get(medicamentos.getMedicamento);
    }

}
