package DAO.implementacion;
import DAO.interfaz.RecetaInterfaz;
import entity.Receta;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class RecetaDAO implements RecetaInterfaz {
    private static RecetaDAO instance;
    private Map<Integer, Receta> recetas;

    public RecetaDAO() {
        recetas = new HashMap<>();
    }
    //uso el patron singleton
    public static RecetaDAO getInstance() {
        if (instance == null) {
            instance = new RecetaDAO();
        }
        return instance;
    }

    @Override
    public String agregarReceta(Receta receta) {
        recetas.put(receta.getId(), receta);
        return "La receta fue agregada correctamente";
    }

    @Override
    public Receta obtenerReceta(int id) {
        return recetas.get(id);
    }
    @Override
    public String actualizarReceta(Receta receta) {
        recetas.put(receta.getId(), receta);
        return "La receta fue actualizada correctamente";
    }

    @Override
    public String eliminarReceta(int id) {
        recetas.remove(id);
        return "La receta fue eliminada correctamente";
    }

    @Override
    public List<Receta> listarRecetas() {
        return new ArrayList<>(recetas.values());
    }
}
