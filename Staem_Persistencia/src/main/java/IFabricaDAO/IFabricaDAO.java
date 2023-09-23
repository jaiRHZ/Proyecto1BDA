/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IFabricaDAO;

import conexionBD.IConexionBD;
import interfacesDAO.*;

/**
 *
 * @author HP
 */
public interface IFabricaDAO {

    public ICarritoDAO crearCarritoDAO();

    public ICompradoresDAO crearCompradoresDAO();

    public IComprasDAO crearComprasDAO();

    public ICopiasDAO crearCopiassDAO();

    public IVideojuegosDAO crearVidejuegosDAO();

}
