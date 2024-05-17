package service;

import entity.*;

import java.util.List;

public class AtencionMedicoService {
    private static AtencionMedicoService instance;
    private Contenedor contenedor;

    private AtencionMedicoService(Contenedor contenedor) {
        this.contenedor = contenedor;
    }

    public static AtencionMedicoService getInstance(Contenedor contenedor) {
        if (instance == null) {
            instance = new AtencionMedicoService(contenedor);
        }
        return instance;
    }

    public Turno iniciarTurno(Turno turno) {
        System.out.println("- Inicia el turno -");
        Turno turnoActualizado = new Turno(turno.getId(), turno.getPaciente(), turno.getMedico(), turno.isUsaObraSocial(), true);
        contenedor.getTurnoInterfaz().actualizarTurno(turnoActualizado);
        return turnoActualizado;
    }

    public Receta generarReceta(Turno turno, List<Medicamento> medicamentos) {
        if (!medicamentos.isEmpty()) {
            System.out.println("Generando receta...");

            int numeroDeRecetas = contenedor.getRecetaInterfaz().listarRecetas().size();

            Receta recetaFinal = new Receta(numeroDeRecetas + 1,turno.getPaciente(),turno.getMedico(),medicamentos);

            contenedor.getRecetaInterfaz().agregarReceta(recetaFinal);

            return recetaFinal;
        }
        return null;
    }

    public void finalizarTurno(Turno turno) {
        Turno turnoActualizado = new Turno(turno.getId(), turno.getPaciente(), turno.getMedico(), turno.isUsaObraSocial(), false);
        contenedor.getTurnoInterfaz().actualizarTurno(turnoActualizado);
        System.out.println("- Turno finalizado -");
    }
}
