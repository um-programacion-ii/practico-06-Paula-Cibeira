package DAO.implementacion;

import DAO.interfaz.PedidoInterfaz;
import entity.Pedido;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class PedidoDAO implements PedidoInterfaz {
    private static PedidoDAO instance;
    private Map<Integer, Pedido> pedidos;

    private PedidoDAO() {
        pedidos = new HashMap<>();
    }
    //uso el patron singleton
    public static PedidoDAO getInstance() {
        if (instance == null) {
            instance = new PedidoDAO();
        }
        return instance;
    }

    @Override
    public String agregarPedido(Pedido pedido) {
        pedidos.put(pedido.getId(), pedido);
        return "El pedido fue agregado correctamente";
    }

    @Override
    public Pedido obtenerPedido(int id) {
        return pedidos.get(id);
    }
    @Override
    public String actualizarPedido(Pedido pedido) {
        pedidos.put(pedido.getId(), pedido);
        return "El pedido fue actualizado correctamente";
    }

    @Override
    public String eliminarPedido(int id) {
        pedidos.remove(id);
        return "El pedido fue eliminado correctamente";
    }

    @Override
    public List<Pedido> listarPedidos() {
        return new ArrayList<>(pedidos.values());
    }
}
