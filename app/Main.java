/**
*=========================
*  Clase PRINCIPAL
*=========================
*/
package app;

import modelo.Accesorio;
import modelo.Computador;
import modelo.Telefono;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== Constructor por defecto =====");

        Computador computador1 = new Computador();

        computador1.mostrarInformacion();

        System.out.println();

        System.out.println("===== Constructores parametrizados =====");

        Computador computador =
                new Computador(
                        "PC001",
                        "Notebook Lenovo",
                        899990,
                        "Intel Core i7");

        Telefono telefono =
                new Telefono(
                        "TEL001",
                        "Samsung Galaxy S24",
                        799990,
                        "Android");

        Accesorio accesorio =
                new Accesorio(
                        "ACC001",
                        "Mouse Inalámbrico",
                        24990,
                        "Periférico");

        computador.mostrarInformacion();

        System.out.println();

        telefono.mostrarInformacion();

        System.out.println();

        accesorio.mostrarInformacion();

    }

}