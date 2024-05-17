package DAO.implementacion;

import DAO.interfaz.CompraInterfaz;
import entity.Compra;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class CompraDAO implements CompraInterfaz {
    private static CompraDAO instance;
    private Map<Integer, Compra> compras;

    public CompraDAO() {
        compras = new HashMap<>();
    }

    //uso el patron singleton
    public static CompraDAO getInstance() {
        if (instance == null) {
            instance = new CompraDAO();
        }
        return instance;
    }

    @Override
    public String agregarCompra(Compra compra) {
        compras.put(compra.getId(), compra);
        return "La compra se agregó correctamente";
    }

    @Override
    public Compra obtenerCompra(int id) {
        return compras.get(id);
    }
    @Override
    public String actualizarCompra(Compra compra) {
        compras.put(compra.getId(), compra);
        return "La compra fue actualizada correctamente";
    }

    @Override
    public String eliminarCompra(int id) {
        compras.remove(id);
        return "La compra fue eliminada correctamente";
    }
    @Override
    public List<Compra> listarCompras() {
        return new ArrayList<>(compras.values());
    }
}
