/**
*=========================
* Clase PADRE
*=========================
*/

package modelo;

public class Producto {

    protected String codigo;
    protected String nombre;
    protected double precio;

    // Constructor por defecto
    public Producto() {
        this("SIN_CODIGO", "SIN_NOMBRE", 0);
    }

    // Constructor parametrizado
    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarInformacion() {

        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);

    }

}