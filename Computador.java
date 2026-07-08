/**
*=========================
* Producto.java
* Clase HIJA
*=========================
*/
package modelo;

public class Computador extends Producto {

    private String procesador;

    public Computador(String codigo,
                      String nombre,
                      double precio,
                      String procesador) {

        super(codigo, nombre, precio);
        this.procesador = procesador;

    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();
        System.out.println("Procesador: " + procesador);

    }

}