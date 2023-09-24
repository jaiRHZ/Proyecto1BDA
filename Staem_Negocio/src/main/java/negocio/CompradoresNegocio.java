/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import fachada.IFachadaPersistencia;
import dominio.Comprador;

/**
 *
 * @author HP
 */
public class CompradoresNegocio {

    private final IFachadaPersistencia fachadaPersistencia;

    public CompradoresNegocio(IFachadaPersistencia fachadaPersistencia) {
        this.fachadaPersistencia = fachadaPersistencia;
    }

    public Comprador agregarComprador(Comprador comprador) {
        return fachadaPersistencia.agregarComprador(comprador);
    }

}
