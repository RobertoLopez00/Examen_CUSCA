// Clase que representa un producto no perecible
public class NoPerecible extends Producto {
    private int contenido; // Contenido del producto en gramos
    private int calorias;  // Calorías del producto

    // Constructor para inicializar los atributos
    public NoPerecible(String nombre, double precio, int contenido, int calorias) {
        super(nombre, precio); // Llama al constructor de la clase base Producto
        this.contenido = contenido;
        this.calorias = calorias;
    }

    // Método para obtener el contenido del producto
    public int getContenido() {
        return contenido;
    }

    // Método para obtener las calorías del producto
    public int getCalorias() {
        return calorias;
    }
}