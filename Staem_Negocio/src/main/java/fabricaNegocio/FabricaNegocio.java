/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaNegocio;

import fachada.FachadaPersistencia;
import negocio.CompradoresNegocio;
import fachada.IFachadaPersistencia;

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

}
