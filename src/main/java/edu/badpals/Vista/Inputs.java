package edu.badpals.Vista;

import edu.badpals.Modelo.Pelicula;
import edu.badpals.Modelo.Tematica;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Inputs {
    private Scanner sc = new Scanner(System.in);
    private final String[] TEMATICAS = {"Accion","Aventura","Ciencia_Ficcion","Romance","Terror"};

    public Inputs(){
    }

    public int pedirID(){
        int id = -1;
        while (id == -1) {
            Prints.pedirID();
            try {
                id = sc.nextInt();
            } catch (InputMismatchException e) {
                Prints.errorID();
                sc.next();
            }
    }
        return id;
    }

    public String Menu(){
        String r;
        Prints.displayMenu();
        r = sc.next();
        while (!r.matches("\\d+")) {
            Prints.errorMenu();
            Prints.displayMenu();
            r = sc.nextLine();
        }
        return r;
    }

    public Pelicula pedirPeli(){
        Pelicula peli = new Pelicula();
        Prints.crearPeli();

        Prints.pedirTitulo();
        String titulo = sc.next();
        peli.setTitulo(titulo);

        Prints.pedirProtagonista();
        String prota = sc.next();
        peli.setProtagonista(prota);
        String tematica = "";
        Prints.pedirTematica();
        tematica = sc.next();
        while(!Arrays.asList(TEMATICAS).contains(tematica)){
            Prints.errorTematica();
            Prints.pedirTematica();
            tematica = sc.next();

        }
        peli.setTematica(Tematica.valueOf(tematica));


        Prints.pedirGuion();
        String guion = sc.next();
        peli.setGuion(guion);

        Prints.pedirDisponible();
        String disponible = sc.next();
        peli.setDisponible(Objects.equals(disponible, "s"));

        return peli;
    }
}
