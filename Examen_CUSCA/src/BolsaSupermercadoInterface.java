import java.util.List;

public interface BolsaSupermercadoInterface<T> {
    // Métodos para manejar productos
    void addProducto(T producto);
    List<T> getProductos();
    T getProducto(int index);
    void updateProducto(int index, T producto);
    void deleteProducto(int index);


    // Métodos para manejar órdenes
    void addOrden(Orden<T> orden);
    List<Orden<T>> getOrdenes();
    Orden<T> getOrden(int id);
    void updateOrden(int id, Orden<T> nuevaOrden);
    void deleteOrden(int id);
}

//Son los metodos que yo considere necesarios para poder hacer una bolsa, implementando un crud en cada uno, o sea producto y orden.
//Estan se implementan en BolsaSupermercado