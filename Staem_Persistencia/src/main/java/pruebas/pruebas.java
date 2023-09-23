/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import conexionBD.ConexionMySQL;
import conexionBD.IConexionBD;
import implementaciones.VideojuegoDAO;
import interfacesDAO.IVideojuegosDAO;
import dominio.Videojuego;
import excepciones.SQLException;

/**
 *
 * @author HP
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here

        IConexionBD conexion = new ConexionMySQL();
        IVideojuegosDAO vidojuegosDAO = new VideojuegoDAO(conexion);
        Videojuego videjuego = new Videojuego("Mario", "Aventura", "Nintendo", "Afd");
        vidojuegosDAO.guardarVideojuego(videjuego);
    }

}
