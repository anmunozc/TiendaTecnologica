/**
*=========================
* Clase HIJA
*=========================
*/
package modelo;

public class Accesorio extends Producto {

    private String tipo;

    public Accesorio(String codigo,
                     String nombre,
                     double precio,
                     String tipo) {

        super(codigo, nombre, precio);
        this.tipo = tipo;

    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();
        System.out.println("Tipo: " + tipo);

    }

}
