package edu.badpals;

import edu.badpals.Controlador.Controlador;
import edu.badpals.Modelo.Conexion;
import edu.badpals.Modelo.Pelicula;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Controlador controller = new Controlador();
        controller.Menu();
    }
}