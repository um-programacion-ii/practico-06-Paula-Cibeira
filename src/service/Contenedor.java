package service;

import DAO.implementacion.*;
import DAO.interfaz.*;

public class Contenedor {

    private static Contenedor instance;
    private ObraSocialInterfaz obraSocialInterfaz;
    private RecetaInterfaz recetaInterfaz;
    private CompraInterfaz compraInterfaz;
    private PedidoInterfaz pedidoInterfaz;
    private MedicamentoInterfaz medicamentoInterfaz;
    private MedicoInterfaz medicoInterfaz;
    private EspecialidadInterfaz especialidadInterfaz;
    private PacienteInterfaz pacienteInterfaz;
    private TurnoInterfaz turnoInterfaz;

    private Contenedor() {
        obraSocialInterfaz = new ObraSocialDAO();
        recetaInterfaz = new RecetaDAO();
        compraInterfaz = new CompraDAO();
        pedidoInterfaz = new PedidoDAO();
        medicamentoInterfaz = new MedicamentoDAO();
        medicoInterfaz = new MedicoDAO();
        especialidadInterfaz = new EspecialidadDAO();
        pacienteInterfaz = new PacienteDAO();
        turnoInterfaz = new TurnoDAO();

    }
    //patron singleton
    public static Contenedor getInstance() {
        if (instance == null) {
            instance = new Contenedor();
        }
        return instance;
    }
    // getters
    public ObraSocialInterfaz getObraSocialInterfaz() {
        return obraSocialInterfaz;
    }
    public RecetaInterfaz getRecetaInterfaz() {
        return recetaInterfaz;
    }

    public CompraInterfaz getCompraInterfaz() {
        return compraInterfaz;
    }

    public PedidoInterfaz getPedidoInterfaz() {
        return pedidoInterfaz;
    }

    public MedicamentoInterfaz getMedicamentoInterfaz() {
        return medicamentoInterfaz;
    }

    public MedicoInterfaz getMedicoInterfaz() {
        return medicoInterfaz;
    }

    public EspecialidadInterfaz getEspecialidadInterfaz() {
        return especialidadInterfaz;
    }

    public PacienteInterfaz getPacienteInterfaz() {
        return pacienteInterfaz;
    }

    public TurnoInterfaz getTurnoInterfaz() {
        return turnoInterfaz;
    }
}
