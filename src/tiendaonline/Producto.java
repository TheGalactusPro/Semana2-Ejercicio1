package tiendaonline;

public class Producto {
    public String nombre;
    public double precio;
    String categoria;
    boolean disponible;

    public void MostrarInformacion(){
        System.out.println("Nombre: " +nombre+ "\nPrecio: " +precio+ "\nCategoría: " +categoria);
    }

    public void CambiarDisponiblidad(boolean NuevaDisponibilidad){
        disponible = NuevaDisponibilidad;
    }

    void MostrarPrecio(){
        System.out.println("Precio: " +precio);
    }

    void MostrarDisponibilidad(){
        String estado = disponible ? "DISPONIBLE" : "NO DISPONIBLE";
        System.out.println(estado);
    }
}