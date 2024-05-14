package DAO.interfaz;
import entity.Compra;
import entity.Paciente;

import java.util.List;

public interface CompraInterfaz {
    String agregarCompra(Compra compra);
    Compra obtenerCompra(int id);
    String actualizarCompra(Compra compra);
    String eliminarCompra(int id);
    List<Compra> listarCompras();
}
