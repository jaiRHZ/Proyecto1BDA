/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import fabricaDAO.FabricaDAO;
import conexionBD.ConexionMySQL;
import conexionBD.IConexionBD;
import implementaciones.VideojuegoDAO;
import interfacesDAO.*;
import dominio.*;
import excepciones.SQLException;
import implementaciones.CompradoresDAO;
import java.security.NoSuchAlgorithmException;
import fachada.FachadaPersistencia;

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
        FachadaPersistencia fachada = new FachadaPersistencia();
        Comprador comprador = new Comprador("daoma222@gmail.com", "Daniel", "Alameda", "López", new Domicilio("tepic", "123", "123"), new Credencial("Daoma", "1233"));
        fachada.agregarComprador(comprador);
        Comprador comprador2 = new Comprador("daoma222@gmail.com", "Daniel", "Alameda", "López", new Domicilio("tepic", "123", "123"), new Credencial("Daomaa", "1233"));
        fachada.agregarComprador(comprador2);
        System.out.println(comprador2.getId());
//        Videojuego videjuego = new Videojuego("Mario", "Aventura", "Nintendo", "Afd");
//        vidojuegosDAO.agregarVideojuego(videjuego);
    }

}
