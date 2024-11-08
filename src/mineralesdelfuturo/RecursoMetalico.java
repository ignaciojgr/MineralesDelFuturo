package mineralesdelfuturo;

public class RecursoMetalico extends Recurso {

    private Double valorMercado;

    public RecursoMetalico() {
    }

    public RecursoMetalico(Double valorMercado, String codigo, String nombre, Double cantidad) {
        super(codigo, nombre, cantidad);
        this.valorMercado = valorMercado;
    }

    @Override
    public void mostrarDatos() {
    }

    @Override
    public String requierePermiso(Recurso recurso) {
        return null;
    }
}
