package mineralesdelfuturo;

public class RecursoNoMetalico extends Recurso implements PermisoExtraccion {

    private String usoIndustrial;

    public RecursoNoMetalico() {
    }

    public RecursoNoMetalico(String usoIndustrial, String codigo, String nombre, Double cantidad) {
        super(codigo, nombre, cantidad);
        this.usoIndustrial = usoIndustrial;
    }

    @Override
    public void mostrarDatos() {
    }
    
    @Override
    public String requierePermiso(Recurso recurso){
        return null;
    }
}
