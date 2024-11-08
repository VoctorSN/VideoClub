package edu.badpals.Vista;

import edu.badpals.Modelo.Pelicula;

import java.util.List;

public class Prints {
    public static void mostrarPelis(List<Pelicula> pelis) {
        for (Pelicula peli : pelis) {
            System.out.println(peli);
        }
    }

    public static void mostrarPeli(Pelicula peli) {
        if (peli == null){
            Prints.errorPeliculas();
        } else {
        System.out.println(peli);
        }
    }

    public static void pedirID() {
        System.out.println();
        Prints.cambiarLinea();
        System.out.println("Dame el ID de una pelicula de la base de datos");
        Prints.cambiarLinea();
        System.out.println();
    }

    public static void cambiarLinea() {
        System.out.println("====================================================================================================================================================");
    }

    public static void noID() {
        System.out.println("El ID no se encontro");
    }

    public static void eliminarPeli() {
        System.out.println();
        Prints.cambiarLinea();
        System.out.println("Vamos a eliminar una pelicula por ID");
        Prints.cambiarLinea();
        System.out.println();
    }

    public static void crearPeli() {
        System.out.println();
        Prints.cambiarLinea();
        System.out.println("Vamos a crear una pelicula");
        Prints.cambiarLinea();
        System.out.println();
    }

    public static void eliminarPeliCorrecto() {
        System.out.println("Pelicula Eliminada Correctamente");
    }

    public static void errorEliminar() {
        System.out.println("Ocurrio un error eliminando la Pelicula");
    }

    public static void errorTematica() {
        System.out.println("No es una tematica correcta, elige entre (Accion, Aventura, Ciencia_Ficcion, Romance, Terror)");
    }

    public static void errorMenu() {
        System.out.println("El numero tiene que estar entre el 1-6");
    }

    public static void errorID() {
        System.out.println("Ocurrio un error con el ID");
    }

    public static void errorPeliculas() {
        System.out.println("No se encontro la pelicula");
    }

    public static void modificarPeli() {
        System.out.println();
        Prints.cambiarLinea();
        System.out.println("Vamos a modificar una pelicula por ID");
        Prints.cambiarLinea();
        System.out.println();
    }

    public static void modificarCorrecto() {
        System.out.println("Pelicula Modificada Correctamente");
    }

    public static void errorModificar() {
        System.out.println("Ocurrio un error modificando la Pelicula");
    }
    public static void insertarCorrecto() {
        System.out.println("Pelicula Insertada Correctamente");
    }

    public static void errorInsertar() {
        System.out.println("Ocurrio un error Insertar la Pelicula");
    }


    public static void pedirTitulo() {
        System.out.println();
        Prints.cambiarLinea();
        System.out.println("Dame el titulo de la pelicula");
        Prints.cambiarLinea();
        System.out.println();
    }

    public static void pedirProtagonista() {
        System.out.println();
        Prints.cambiarLinea();
        System.out.println("Dame el protagonista de la pelicula");
        Prints.cambiarLinea();
        System.out.println();
    }

    public static void pedirTematica() {
        System.out.println();
        Prints.cambiarLinea();
        System.out.println("Dame la tematica de la pelicula (Accion, Aventura, Ciencia_Ficcion, Romance, Terror)");
        Prints.cambiarLinea();
        System.out.println();
    }

    public static void pedirGuion() {
        System.out.println();
        Prints.cambiarLinea();
        System.out.println("Dame el guion de la pelicula");
        Prints.cambiarLinea();
        System.out.println();
    }

    public static void pedirDisponible() {
            System.out.println();
            Prints.cambiarLinea();
            System.out.println("¿Esta disponible la pelicula? (s/N)");
            Prints.cambiarLinea();
            System.out.println();
        }

    public static void displayMenu() {
        System.out.println();
        Prints.cambiarLinea();
        System.out.println("1. Listado de películas\n" +
                "2. Pintado de datos de una película\n" +
                "3. Borrado de una película\n" +
                "4. Modificar una película\n" +
                "5. Crear nueva película\n" +
                "6. Salir");
        Prints.cambiarLinea();
        System.out.println();
    }
}
