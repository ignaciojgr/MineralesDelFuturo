package mineralesdelfuturo;

public abstract class Recurso {

    private String codigo;
    private String nombre;
    private Double cantidad;

    public Recurso() {
    }

    public Recurso(String codigo, String nombre, Double cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public abstract void mostrarDatos();

}
