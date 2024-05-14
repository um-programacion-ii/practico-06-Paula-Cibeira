package DAO.interfaz;
import entity.Pedido;
import java.util.List;

public interface PedidoInterfaz {
    String agregarPedido(Pedido pedido);
    Pedido obtenerPedido(int id);
    String actualizarPedido(Pedido pedido);
    String eliminarPedido(int dni);
    List<Pedido> listarPedidos();

}




