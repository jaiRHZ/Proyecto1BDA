/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import dominio.Compra;
import fabricaDAO.FabricaDAO;
import fabricaDAO.IFabricaDAO;
import dominio.Comprador;
import dominio.Copia;
import excepciones.SQLException;
import interfacesDAO.ICompradoresDAO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class FachadaPersistencia implements IFachadaPersistencia {

    private final IFabricaDAO fabricaDAO;

    public FachadaPersistencia() {
        this.fabricaDAO = new FabricaDAO();

    }

    @Override
    public Comprador agregarComprador(Comprador comprador) {
        try {
            return fabricaDAO.crearCompradoresDAO().agregarComprador(comprador);
        } catch (SQLException ex) {
            Logger.getLogger(FachadaPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Comprador consultarComprador(Comprador comprador) {
        try {
            return fabricaDAO.crearCompradoresDAO().consultarComprador(comprador);
        } catch (SQLException ex) {
            Logger.getLogger(FachadaPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Copia consultarCopia(Integer id) {
        try {
            return fabricaDAO.crearCopiassDAO().consultarCopia(id);
        } catch (SQLException ex) {
            Logger.getLogger(FachadaPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Compra agregarCompra(Compra compra, List<Copia> copias) {
        try {
            return fabricaDAO.crearComprasDAO().agregarCompra(compra, copias);
        } catch (SQLException ex) {
            Logger.getLogger(FachadaPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
