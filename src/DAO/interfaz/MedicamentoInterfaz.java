package DAO.interfaz;
import entity.Medicamento;
import java.util.List;

public interface MedicamentoInterfaz {
    String agregarMedicamento(Medicamento medicamento);
    Medicamento obtenerMedicamento(int id);
    String actualizarMedicamento(Medicamento medicamento);
    String eliminarMedicamento(int id);
    List<Medicamento> listarMedicamentos();
}
