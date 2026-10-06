package tiendaonline;

public class MainProducto {
    static void main() {
        Producto p1 = new Producto();
        Producto p2 = new Producto();
        Producto p3 = new Producto();

        p1.nombre = "Audífonos Bluetooth";
        p1.precio = 32.50;
        p1.categoria = "Tecnología";
        p1.disponible = true;

        p2.nombre = "Camiseta";
        p2.precio = 15;
        p2.categoria = "Ropa";
        p2.disponible = true;

        p3.nombre = "Curso Java";
        p3.precio = 75;
        p3.categoria = "Educación";
        p3.disponible = false;

        System.out.println("Prodcuto 1");
        p1.MostrarInformacion();

        System.out.println("-----------------------------------------");

        System.out.println("\nProducto 2");
        p2.MostrarInformacion();

        System.out.println("-----------------------------------------");

        System.out.println("\nProducto 3");
        p3.MostrarInformacion();

        //Métodos de acceso por defecto

        System.out.println("\nPrecio del producto 1");
        p1.MostrarPrecio();

        System.out.println("\nDisponibilidad del producto 1");
        p1.MostrarDisponibilidad();

        //Cambio de dispobilidad del prodcuto 1

        p1.CambiarDisponiblidad(false);

        System.out.println("\nProducto 1");
        p1.MostrarInformacion();
        p1.MostrarDisponibilidad();
    }
}