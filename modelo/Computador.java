/**
 *=========================
 * Clase HIJA
 *=========================
 */

package modelo;

public class Computador extends Producto {

    private String procesador;

    // Constructor por defecto
    public Computador() {
        this("SIN_CODIGO", "SIN_NOMBRE", 0, "NO ESPECIFICADO");
    }

    // Constructor parametrizado
    public Computador(String codigo,
                      String nombre,
                      double precio,
                      String procesador) {

        super(codigo, nombre, precio);
        this.procesador = procesador;

    }

    @Override
    public String obtenerCategoria() {
        return "Computador";
    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();
        System.out.println("Procesador: " + procesador);

    }

}