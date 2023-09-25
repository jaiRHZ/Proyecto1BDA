/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import dominio.Compra;
import dominio.Copia;
import fachada.IFachadaPersistencia;
import java.util.List;

/**
 *
 * @author HP
 */
public class CompraNegocio {

    private final IFachadaPersistencia fachadaPersistencia;

    public CompraNegocio(IFachadaPersistencia fachadaPersistencia) {
        this.fachadaPersistencia = fachadaPersistencia;
    }

    public Compra agregarCompra(Compra compra, List<Copia> copias) {
        return fachadaPersistencia.agregarCompra(compra, copias);
    }
}
