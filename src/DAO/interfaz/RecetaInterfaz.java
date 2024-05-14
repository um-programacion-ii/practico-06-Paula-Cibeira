package DAO.interfaz;
import entity.Receta;
import java.util.List;

public interface RecetaInterfaz {
    String agregarReceta(Receta receta);
    Receta obtenerReceta(int id);
    String actualizarReceta(Receta receta);
    String eliminarReceta(int id);
    List<Receta> listarRecetas();
}
