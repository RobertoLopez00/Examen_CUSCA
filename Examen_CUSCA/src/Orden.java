// Clase que representa una orden de un producto
public class Orden<T> {
    private int id;         // Identificador único de la orden
    private T producto;     // Producto asociado a la orden
    private int cantidad;   // Cantidad del producto en la orden
    private String fecha;   // Fecha de la orden

    // Constructor para inicializar los atributos
    public Orden(int id, T producto, int cantidad, String fecha) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    // Métodos getter y setter para los atributos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public T getProducto() {
        return producto;
    }

    public void setProducto(T producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}