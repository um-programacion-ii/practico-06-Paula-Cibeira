package service;
import entity.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Inicializar {

    private static Inicializar instance;
    private Contenedor contenedor;
    private Random random;

    private Inicializar() {
        contenedor = Contenedor.getInstance();
        random = new Random();
    }

    public static Inicializar getInstance() {
        if (instance == null) {
            instance = new Inicializar();
        }
        return instance;
    }

    public void inicializarEntidades() {

        // obras sociales
        List<ObraSocial> obraSociales = new ArrayList<>();
        obraSociales.add(new ObraSocial(1, "Galeno"));
        obraSociales.add(new ObraSocial(2, "OSDE"));
        obraSociales.forEach(os -> contenedor.getObraSocialInterfaz().agregarObraSocial(os));



        // especialidades
        List<Especialidad> especialidades = new ArrayList<>();
        especialidades.add(new Especialidad(1,"Pediatría"));
        especialidades.add(new Especialidad(2,"Odontología"));
        especialidades.add(new Especialidad(3,"Ginecología"));
        especialidades.add(new Especialidad(4,"Dermatología"));
        //System.out.println(especialidades.size());
        especialidades.forEach(e -> contenedor.getEspecialidadInterfaz().agregarEspecialidad(e));

        // medicos
        int j = 0;
        for (ObraSocial obraSocial : obraSociales) {
            for (int i = 0; i < 4; i++) {
                Especialidad especialidad = randomEspecialidad();
                Medico medico = new Medico("Nombre medico: " + (j + 1), 1000 + j, random.nextBoolean(), new ArrayList<>(List.of(obraSocial)), especialidad);
                contenedor.getMedicoInterfaz().agregarMedico(medico);
                j = j + 1;
            }
        }

        // pacientes
        for (int i = 0; i < 9; i++) {
            ObraSocial obraSocial = randomObraSocial();
            Paciente paciente = new Paciente("Paciente " + (i + 1), 4000 + i, obraSocial);
            contenedor.getPacienteInterfaz().agregarPaciente(paciente);
        }



        // medicamentos
        List<Medicamento> medicamentos = new ArrayList<>();
        medicamentos.add(new Medicamento(1, "Paracetamol"));
        medicamentos.add(new Medicamento(2, "Fluticasona"));
        medicamentos.add(new Medicamento(3, "Actron 600"));
        medicamentos.add(new Medicamento(4, "Refrianex"));
        medicamentos.forEach(m -> contenedor.getMedicamentoInterfaz().agregarMedicamento(m));



        inicializarFarmacia(medicamentos);

        Drogueria drogueria = Drogueria.getInstance();
    }

    private void inicializarFarmacia(List<Medicamento> medicamentos) {
        Farmacia farmacia = Farmacia.getInstance();
        for (Medicamento medicamento : medicamentos) {
            farmacia.agregarStock(medicamento, random.nextInt(50) + 1);
        }
    }

    public void listarPacientesYMedicos() {
        List<Paciente> pacientes = contenedor.getPacienteInterfaz().listarPacientes();
        System.out.println("Pacientes:");
        pacientes.forEach(p -> System.out.println(p.getNombre() + " - DNI: " + p.getDni() +
                " - Obra Social: " + p.getObraSocial().getNombre()));

        List<Medico> medicos = contenedor.getMedicoInterfaz().listarMedicos();
        System.out.println("\nMédicos:");
        medicos.forEach(m -> {
            System.out.println(m.getNombre() + " - DNI: " + m.getId() +
                    " - Especialidad: " + m.getEspecialidad().getNombre() +
                    " - Obra Social(es): " +
                    m.getObraSocial().stream()
                            .map(ObraSocial::getNombre)
                            .collect(Collectors.joining(", ")));
        });
    }

    public void mostrarStockFarmacia() {
        Farmacia farmacia = Farmacia.getInstance();
        System.out.println("\nStock de la Farmacia:");
        farmacia.getStock().forEach((medicamento, cantidad) -> {
            System.out.println(medicamento.getNombre() + ": " + cantidad);
        });
    }

    private Especialidad randomEspecialidad() {
        List<Especialidad> especialidades = contenedor.getEspecialidadInterfaz().listarEspecialidades();
        int i = random.nextInt(especialidades.size());
        return especialidades.get(i);
    }

    private ObraSocial randomObraSocial() {
        List<ObraSocial> obraSociales = contenedor.getObraSocialInterfaz().listarObrasSociales();
        int indice = random.nextInt(obraSociales.size());
        return obraSociales.get(indice);
    }
}
