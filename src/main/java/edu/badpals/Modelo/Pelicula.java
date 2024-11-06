package edu.badpals.Modelo;

public class Pelicula {

    private int id;
    private String titulo;
    private String protagonista;
    private Tematica tematica;
    private String guion;
    private boolean disponible;

    public Pelicula(){}

    public Pelicula(String titulo, String protagonista, Tematica tematica, String guion, boolean disponible) {
        this.titulo = titulo;
        this.protagonista = protagonista;
        this.tematica = tematica;
        this.guion = guion;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }

    public Tematica getTematica() {
        return tematica;
    }

    public void setTematica(Tematica tematica) {
        this.tematica = tematica;
    }

    public String getGuion() {
        return guion;
    }

    public void setGuion(String guion) {
        this.guion = guion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", protagonista='" + protagonista + '\'' +
                ", tematica=" + tematica +
                ", guion='" + guion + '\'' +
                ", disponible=" + disponible +
                '}';
    }
}
