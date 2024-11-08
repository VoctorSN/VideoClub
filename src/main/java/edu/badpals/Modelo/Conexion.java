package edu.badpals.Modelo;

import edu.badpals.Vista.Inputs;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    public Conexion() {
    }


    private Connection makeConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/videoclub", "a23victorsn", "renaido");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Pelicula> getPeliculas() {
        try {
            Connection c = makeConexion();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT * FROM PELICULAS");
            List<Pelicula> peliculas = new ArrayList<>();
            while (rs.next()) {
                Pelicula peli = new Pelicula(rs.getString(2),
                        rs.getString(3), Tematica.valueOf(rs.getObject(4).toString()),
                        rs.getString(5), rs.getBoolean(6));
                peli.setId(rs.getInt(1));
                peliculas.add(peli);
            }
            s.close();
            c.close();
            return peliculas;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Pelicula getPelicula(int id){
        try {
            Connection c = makeConexion();
            PreparedStatement ps = c.prepareStatement("SELECT * FROM PELICULAS WHERE ID = ?");
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if (!rs.next()){
                return null;
            }
            Pelicula peli = new Pelicula(rs.getString(2),
                        rs.getString(3), Tematica.valueOf(rs.getObject(4).toString()),
                        rs.getString(5), rs.getBoolean(6));
                peli.setId(rs.getInt(1));
            ps.close();
            c.close();
            return peli;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int borrarPelicula(int id){
        try {
            Connection c = makeConexion();
            PreparedStatement ps = c.prepareStatement("DELETE FROM PELICULAS WHERE ID = ?");
            ps.setInt(1,id);
            int res = ps.executeUpdate();
            ps.close();
            c.close();
            return res;


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 2;
    }

    public int modificarPeli(int id, Pelicula peli){
        try {
            Connection c = makeConexion();
            PreparedStatement ps = c.prepareStatement("UPDATE PELICULAS SET titulo = ?, protagonista = ?, tematica = ?, guion = ?, disponible = ? WHERE ID = ?");
            ps.setString(1, peli.getTitulo());
            ps.setString(2, peli.getProtagonista());
            ps.setObject(3, peli.getTematica().toString());
            ps.setString(4, peli.getGuion());
            ps.setBoolean(5, peli.isDisponible());
            ps.setInt(6,id);
            int r = ps.executeUpdate();
            ps.close();
            c.close();
            return r;


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 2;
    }

    public int insertarPelicula(Pelicula peli){
        try {
            Connection c = makeConexion();
            PreparedStatement ps = c.prepareStatement("INSERT INTO PELICULAS (titulo,protagonista,tematica,guion,disponible) VALUES (?,?,?,?,?)");
            ps.setString(1, peli.getTitulo());
            ps.setString(2, peli.getProtagonista());
            ps.setObject(3, peli.getTematica().toString());
            ps.setString(4, peli.getGuion());
            ps.setBoolean(5, peli.isDisponible());
            int r = ps.executeUpdate();
            ps.close();
            c.close();
            return r;


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 2;
    }
}
