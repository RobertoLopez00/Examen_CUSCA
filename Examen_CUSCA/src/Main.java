public class Main {
    public static void main(String[] args) {
        // Crear instancias de BolsaSupermercado para diferentes tipos de productos
        //En este caso se crean bolsas para frutas, lacteos, no perecibles y limpieza
        BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>();
        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>();
        BolsaSupermercado<NoPerecible> bolsaNoPerecibles = new BolsaSupermercado<>();
        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();

        // Agregar productos a las bolsas correspondientes
        //Si vemos, se llenan los 4 atributos, dos de la clase propia y las 2 de la clase padre
        bolsaFrutas.addProducto(new Fruta("Manzana", 0.5, 1.2, "Rojo"));
        bolsaLacteos.addProducto(new Lacteo("Leche", 1.0, 1, 8));
        bolsaNoPerecibles.addProducto(new NoPerecible("Arroz", 0.9, 1, 350));
        bolsaLimpieza.addProducto(new Limpieza("Detergente", 3.0, "Químicos", 2));

        // Crear y agregar órdenes a la bolsa
        Orden<Fruta> ordenFruta = new Orden<>(1, new Fruta("Manzana", 0.5, 1.2, "Rojo"), 10, "2023-10-01");
        bolsaFrutas.addOrden(ordenFruta);
        System.out.println("Productos en bolsa de frutas:");
        BolsaSupermercado.printBolsa(bolsaFrutas);
        BolsaSupermercado.printOrdenes(bolsaFrutas);
        //Despues de insertar cada orden, se imprime la bolsa y la orden con sus detalles y asi para las demas

        Orden<Lacteo> ordenLacteo = new Orden<>(2, new Lacteo("Queso", 2.0, 5, 22), 5, "2023-10-01");
        bolsaLacteos.addOrden(ordenLacteo);
        System.out.println("Productos en bolsa de lácteos:");
        BolsaSupermercado.printBolsa(bolsaLacteos);
        BolsaSupermercado.printOrdenes(bolsaLacteos);

        Orden<NoPerecible> ordenNoPerecible = new Orden<>(3, new NoPerecible("Arroz", 0.9, 1, 350), 2, "2023-10-01");
        bolsaNoPerecibles.addOrden(ordenNoPerecible);
        System.out.println("Productos en bolsa de no perecibles:");
        BolsaSupermercado.printBolsa(bolsaNoPerecibles);
        BolsaSupermercado.printOrdenes(bolsaNoPerecibles);

        Orden<Limpieza> ordenLimpieza = new Orden<>(4, new Limpieza("Detergente", 3.0, "Químicos", 2), 3, "2023-10-01");
        bolsaLimpieza.addOrden(ordenLimpieza);
        System.out.println("Productos en bolsa de limpieza:");
        BolsaSupermercado.printBolsa(bolsaLimpieza);
        BolsaSupermercado.printOrdenes(bolsaLimpieza);


/*        // Actualizar un producto en la bolsa de frutas
        bolsaFrutas.updateProducto(1, new Fruta("Pera", 0.8, 1.5, "Verde"));
        System.out.println("Productos en bolsa de frutas después de actualización:");
        System.out.println(bolsaFrutas.getProducto(1));
        //Creo que imprime el espacio en memoria jaja, falta corregir

        // Eliminar un producto de la bolsa de frutas
        bolsaFrutas.deleteProducto(1);
        System.out.println("Productos en bolsa de frutas después de eliminación:");
        System.out.println(bolsaFrutas);
        //Creo que imprime el espacio en memoria jaja, falta corregir*/

        //Se tendria que ir a modificar el metodo probablemente
    }


}