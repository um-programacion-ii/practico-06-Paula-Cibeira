package DAO.implementacion;

import DAO.interfaz.ObraSocialInterfaz;
import entity.ObraSocial;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class ObraSocialDAO implements ObraSocialInterfaz {
    private static ObraSocialDAO instance;
    private Map<Integer, ObraSocial> obrassociales;

    private ObraSocialDAO() {
        obrassociales = new HashMap<>();
    }

    //uso el patron singleton
    public static ObraSocialDAO getInstance() {
        if (instance == null) {
            instance = new ObraSocialDAO();
        }
        return instance;
    }
    @Override
    public String agregarObraSocial(ObraSocial obrasocial) {
        obrassociales.put(obrasocial.getId(), obrasocial);
        return "Obra Social fue agregada correctamente";
    }

    @Override
    public ObraSocial obtenerObraSocial(int id) {
        return obrassociales.get(id);
    }

    @Override
    public String actualizarObraSocial(ObraSocial obrasocial) {
        obrassociales.put(obrasocial.getId(), obrasocial);
        return "Obra Social fue agregado correctamente";
    }
    @Override
    public String eliminarObraSocial(int id) {
        obrassociales.remove(id);
        return "Obra Social eliminada con exito";
    }
    @Override
    public List<ObraSocial> listarObrasSociales() {
        return new ArrayList<>(obrassociales.values());
    }

}
