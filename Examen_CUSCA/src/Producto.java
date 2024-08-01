public class Producto { //Clase padre de Fruta, Lacteo, NoPerecible y Limpieza

    //No se implementa la interfaz porque eso se trabaja en BolsaSupermercado, solamente es la clase padre

    //Atributos
    protected String nombre;
    protected double precio;

    //Constructor

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //Métodos get

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
