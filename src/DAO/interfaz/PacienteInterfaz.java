package DAO.interfaz;
import entity.Paciente;
import java.util.List;

public interface PacienteInterfaz {

    String agregarPaciente(Paciente paciente);
    Paciente obtenerPaciente(int dni);
    String actualizarPaciente(Paciente paciente);
    String eliminarPaciente(int dni);
    List<Paciente> listarPacientes();
}

