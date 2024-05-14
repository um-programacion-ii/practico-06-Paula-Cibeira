package DAO.interfaz;
import entity.ObraSocial;
import java.util.List;

public interface ObraSocialInterfaz  {

    String agregarObraSocial(ObraSocial obrasocial);
    ObraSocial obtenerObraSocial(int id);
    String actualizarObraSocial(ObraSocial obrasocial);
    String eliminarObraSocial(int id);
    List<ObraSocial> listarObrasSociales();
}
