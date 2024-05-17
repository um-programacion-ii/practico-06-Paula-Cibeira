import service.Inicializar;

public class Main {
    public static void main(String[] args) {
        Inicializar.getInstance().inicializarEntidades();
        Inicializar.getInstance().listarPacientesYMedicos();
        Inicializar.getInstance().mostrarStockFarmacia();
    }
}
