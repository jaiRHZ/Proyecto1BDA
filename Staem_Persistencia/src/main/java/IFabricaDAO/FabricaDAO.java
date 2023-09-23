/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IFabricaDAO;

import conexionBD.ConexionMySQL;
import conexionBD.IConexionBD;
import implementaciones.CarritoDAO;
import implementaciones.CompradoresDAO;
import implementaciones.ComprasDAO;
import implementaciones.CopiasDAO;
import implementaciones.VideojuegoDAO;
import interfacesDAO.ICarritoDAO;
import interfacesDAO.ICompradoresDAO;
import interfacesDAO.IComprasDAO;
import interfacesDAO.ICopiasDAO;
import interfacesDAO.IVideojuegosDAO;

/**
 *
 * @author HP
 */
public class FabricaDAO implements IFabricaDAO {

    private final IConexionBD conexionBD;

    public FabricaDAO() {
        this.conexionBD = new ConexionMySQL();
    }

    @Override
    public ICarritoDAO crearCarritoDAO() {
        return new CarritoDAO(conexionBD);
    }

    @Override
    public ICompradoresDAO crearCompradoresDAO() {
        return new CompradoresDAO(conexionBD);
    }

    @Override
    public IComprasDAO crearComprasDAO() {
        return new ComprasDAO(conexionBD);
    }

    @Override
    public ICopiasDAO crearCopiassDAO() {
        return new CopiasDAO(conexionBD);
    }

    @Override
    public IVideojuegosDAO crearVidejuegosDAO() {
        return new VideojuegoDAO(conexionBD);
    }

}
