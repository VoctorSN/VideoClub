package edu.badpals.Controlador;

import edu.badpals.Modelo.Conexion;
import edu.badpals.Modelo.Pelicula;
import edu.badpals.Vista.Inputs;
import edu.badpals.Vista.Prints;

public class Controlador {
    private Conexion c = new Conexion();
    private Inputs i = new Inputs();

    public void Menu(){
        listarPeliculas();
        getPelicula();
        eliminarPelicula();
        modificarPelicula();
        crearPelicula();
    }

    private void listarPeliculas() {
        Prints.mostrarPelis(c.getPeliculas());
    }

    private void getPelicula(){
        Prints.mostrarPeli(c.getPelicula(i.pedirID()));
    }

    private void eliminarPelicula(){
        Prints.eliminarPeli();
        int retorno = c.borrarPelicula(i.pedirID());
        if (retorno == 2){
            Prints.errorEliminar();
        } else if (retorno == 0) {
            Prints.noID();
        } else {
            Prints.eliminarPeliCorrecto();
        }
    }

    private void modificarPelicula(){
        Prints.modificarPeli();
        int id = i.pedirID();
        while(c.getPelicula(id) == null){
            Prints.errorPeliculas();
            id = i.pedirID();
        }
        Pelicula peli = i.pedirPeli();
        int retorno = c.modificarPeli(id, peli);
        if (retorno == 2){
            Prints.errorModificar();
        } else if (retorno == 0) {
            Prints.noID();
        } else {
            Prints.modificarCorrecto();
        }
    }

    private void crearPelicula(){
        Pelicula peli = i.pedirPeli();
        int retorno = c.insertarPelicula(peli);
        if(retorno == 2){
            Prints.errorInsertar();
        } else if(retorno == 0){
            Prints.noID();
        } else {
            Prints.insertarCorrecto();
        }
    }
}
