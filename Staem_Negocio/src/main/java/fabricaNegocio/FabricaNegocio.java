/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaNegocio;

import fachada.FachadaPersistencia;
import negocio.CompradoresNegocio;
import fachada.IFachadaPersistencia;
import negocio.CopiasNegocio;
import negocio.CompraNegocio;

/**
 *
 * @author HP
 */
public class FabricaNegocio implements IFabricaNegocio {

    private final IFachadaPersistencia fachadaPersistencia;

    public FabricaNegocio() {
        this.fachadaPersistencia = new FachadaPersistencia();
    }

    @Override
    public CompradoresNegocio crearCompradoresNegocio() {
        return new CompradoresNegocio(fachadaPersistencia);
    }

    @Override
    public CopiasNegocio crearCopiassNegocio() {
        return new CopiasNegocio(fachadaPersistencia);
    }

    @Override
    public CompraNegocio crearCompraNegocio() {
        return new CompraNegocio(fachadaPersistencia);
    }

}
