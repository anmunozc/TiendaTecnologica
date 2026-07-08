/**
*=========================
* Producto.java
* Clase PADRE.
*=========================
*/

package modelo;

public class Producto {
    protected String codigo;
    protected String nombre;
    protectd double precio;

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
    }
}