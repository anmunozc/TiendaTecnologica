/**
*=========================
* Clase HIJA
*=========================
*/
package modelo;

public class Telefono extends Producto {

    private String sistemaOperativo;

    public Telefono() {
        this("SIN_CODIGO", "SIN_NOMBRE", 0, "NO ESPECIFICADO");
    }

    public Telefono(String codigo,
                    String nombre,
                    double precio,
                    String sistemaOperativo) {

        super(codigo, nombre, precio);
        this.sistemaOperativo = sistemaOperativo;

    }

    public void mostrarInformacion() {

        super.mostrarInformacion();
        System.out.println("Sistema Operativo: " + sistemaOperativo);

    }

}