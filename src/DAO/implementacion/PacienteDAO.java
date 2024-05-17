package DAO.implementacion;

import DAO.interfaz.PacienteInterfaz;
import entity.Paciente;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

    public class PacienteDAO implements PacienteInterfaz {
        private static PacienteDAO instance;
        private Map<Integer, Paciente> pacientes;

        public PacienteDAO() {
            pacientes = new HashMap<>();
        }

        //uso el patron singleton
        public static PacienteDAO getInstance() {
            if (instance == null) {
                instance = new PacienteDAO();
            }
            return instance;
        }

        @Override
        public String agregarPaciente(Paciente paciente) {
            pacientes.put(paciente.getDni(), paciente);
            return "El paciente fue agregado correctamente";
        }

        @Override
        public Paciente obtenerPaciente(int dni) {
            return pacientes.get(dni);
        }

        @Override
        public String actualizarPaciente(Paciente paciente) {
            pacientes.put(paciente.getDni(), paciente);
            return "El paciente fue actualizado correctamente";
        }

        @Override
        public String eliminarPaciente(int id) {
            pacientes.remove(id);
            return "El paciente fue eliminado correctamente";
        }

        @Override
        public List<Paciente> listarPacientes() {
            return new ArrayList<>(pacientes.values());
        }


}
