/**
*=========================
* Clase HIJA
*=========================
*/
package modelo;

public class Telefono extends Producto {

    private String sistemaOperativo;

    public Telefono(String codigo,
                    String nombre,
                    double precio,
                    String sistemaOperativo) {

        super(codigo, nombre, precio);
        this.sistemaOperativo = sistemaOperativo;

    }

    @Override
    public void mostrarInformacion() {

        super.mostrarInformacion();
        System.out.println("Sistema Operativo: " + sistemaOperativo);

    }

}