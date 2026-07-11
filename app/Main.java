/**
 *=========================
 * Clase PRINCIPAL
 *=========================
 */

package app;

import modelo.Accesorio;
import modelo.Computador;
import modelo.Producto;
import modelo.Telefono;

public class Main {

    public static void main(String[] args) {

        Producto producto;

        producto = new Computador(
                "PC001",
                "Notebook Lenovo",
                899990,
                "Intel Core i7");

        producto.mostrarInformacion();

        System.out.println();

        producto = new Telefono(
                "TEL001",
                "Samsung Galaxy S24",
                799990,
                "Android");

        producto.mostrarInformacion();

        System.out.println();

        producto = new Accesorio(
                "ACC001",
                "Mouse Inalámbrico",
                24990,
                "Periférico");

        producto.mostrarInformacion();

    }

}