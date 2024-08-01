import java.util.ArrayList;
import java.util.List;
//En esta clase se implementan todos los metodos de los dos cruds, para orden y producto
public class BolsaSupermercado<T> implements BolsaSupermercadoInterface<T> {
    private List<T> productos;
    private List<Orden<T>> ordenes;
    private static final int MAX_PRODUCTOS = 5;

    public BolsaSupermercado() {
        this.productos = new ArrayList<>();
        this.ordenes = new ArrayList<>();
    }

    @Override
    public void addProducto(T producto) {
        if (productos.size() < MAX_PRODUCTOS) {
            productos.add(producto);
        } else {
            System.out.println("La bolsa está llena");
        }
    }

    @Override
    public List<T> getProductos() {
        return productos;
    }

    @Override
    public T getProducto(int index) {
        if (index >= 0 && index < productos.size()) {
            return productos.get(index);
        } else {
            System.out.println("Índice fuera de rango");
            return null;
        }
    }

    @Override
    public void updateProducto(int index, T producto) {
        if (index >= 0 && index < productos.size()) {
            productos.set(index, producto);
        } else {
            System.out.println("Índice fuera de rango");
        }
    }

    @Override
    public void deleteProducto(int index) {
        if (index >= 0 && index < productos.size()) {
            productos.remove(index);
        } else {
            System.out.println("Índice fuera de rango");
        }
    }

    @Override
    public void addOrden(Orden<T> orden) {
        ordenes.add(orden);
    }

    @Override
    public List<Orden<T>> getOrdenes() {
        return ordenes;
    }

    @Override
    public Orden<T> getOrden(int id) {
        for (Orden<T> orden : ordenes) {
            if (orden.getId() == id) {
                return orden;
            }
        }
        System.out.println("Orden no encontrada");
        return null;
    }

    @Override
    public void updateOrden(int id, Orden<T> nuevaOrden) {
        for (int i = 0; i < ordenes.size(); i++) {
            if (ordenes.get(i).getId() == id) {
                ordenes.set(i, nuevaOrden);
                return;
            }
        }
        System.out.println("Orden no encontrada");
    }

    @Override
    public void deleteOrden(int id) {
        boolean removed = ordenes.removeIf(orden -> orden.getId() == id);
        if (!removed) {
            System.out.println("Orden no encontrada");
        }
    }

    public static <T extends Producto> void printBolsa(BolsaSupermercado<T> bolsa) {
        for (T producto : bolsa.getProductos()) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
            if (producto instanceof Fruta) {
                Fruta fruta = (Fruta) producto;
                System.out.println("Peso: " + fruta.getPeso());
                System.out.println("Color: " + fruta.getColor());
            } else if (producto instanceof Lacteo) {
                Lacteo lacteo = (Lacteo) producto;
                System.out.println("Cantidad: " + lacteo.getCantidad());
                System.out.println("Proteinas: " + lacteo.getProteinas());
            } else if (producto instanceof NoPerecible) {
                NoPerecible noPerecible = (NoPerecible) producto;
                System.out.println("Contenido: " + noPerecible.getContenido());
                System.out.println("Calorias: " + noPerecible.getCalorias());
            } else if (producto instanceof Limpieza) {
                Limpieza limpieza = (Limpieza) producto;
                System.out.println("Componentes: " + limpieza.getComponentes());
                System.out.println("Litros: " + limpieza.getLitros());
            }
        }
    }

    public static <T> void printOrdenes(BolsaSupermercado<T> bolsa){
        for (Orden<T> orden : bolsa.getOrdenes()){
            System.out.println("ID: " + orden.getId());
            System.out.println("Cantidad: " + orden.getCantidad());
            System.out.println("Fecha: " + orden.getFecha());
        }
    }


}