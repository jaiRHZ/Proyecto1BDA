/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dominio.Copia;
import fachada.IFachadaPersistencia;

/**
 *
 * @author HP
 */
public class CopiasNegocio {

    private final IFachadaPersistencia fachadaPersistencia;

    public CopiasNegocio(IFachadaPersistencia fachadaPersistencia) {
        this.fachadaPersistencia = fachadaPersistencia;
    }

    public Copia consultarCopia(Integer id) {
        return fachadaPersistencia.consultarCopia(id);
        
    }

}
