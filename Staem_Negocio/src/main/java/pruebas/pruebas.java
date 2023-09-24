/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import dominio.Comprador;
import dominio.Credencial;
import dominio.Domicilio;
import fachada.FachadaNegocio;
import fachada.IFachadaNegocio;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author HP
 */
public class pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchAlgorithmException {
        // TODO code application logic here

        IFachadaNegocio fachada = new FachadaNegocio();
        Comprador comprador = new Comprador("daoma222@gmail.com", "Daniel", "Alameda", "López", new Domicilio("tepic", "123", "123"), new Credencial("Daoma", "1233"));
        fachada.agregarComprador(comprador);
    }

}
