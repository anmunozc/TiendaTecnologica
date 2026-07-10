/**
*=========================
* Clase HIJA
*=========================
*/
package modelo;

public class Accesorio extends Producto {

    private String tipo;

    public Accesorio() {
        this("SIN_CODIGO", "SIN_NOMBRE", 0, "NO ESPECIFICADO");
    }

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