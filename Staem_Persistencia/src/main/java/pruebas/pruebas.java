/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import IFabricaDAO.FabricaDAO;
import conexionBD.ConexionMySQL;
import conexionBD.IConexionBD;
import implementaciones.VideojuegoDAO;
import interfacesDAO.*;
import dominio.*;
import excepciones.SQLException;
import implementaciones.CompradoresDAO;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author HP
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, NoSuchAlgorithmException {
        // TODO code application logic here

        FabricaDAO fabrica = new FabricaDAO();

        Comprador comprador = new Comprador("daoma222@gmail.com", "Daniel", "Alameda", "López", new Domicilio("tepic", "123", "123"), new Credencial("Daoma", "123"));
        fabrica.crearCompradoresDAO().agregarComprador(comprador);
//        Videojuego videjuego = new Videojuego("Mario", "Aventura", "Nintendo", "Afd");
//        vidojuegosDAO.agregarVideojuego(videjuego);
    }

}
