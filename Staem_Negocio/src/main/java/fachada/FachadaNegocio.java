/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import fabricaNegocio.FabricaNegocio;
import dominio.Comprador;
import fabricaNegocio.IFabricaNegocio;

/**
 *
 * @author HP
 */
public class FachadaNegocio implements IFachadaNegocio {

    private final IFabricaNegocio fabricaNegocio;

    public FachadaNegocio() {
        this.fabricaNegocio = new FabricaNegocio();
    }

    @Override
    public Comprador agregarComprador(Comprador comprador) {
        return fabricaNegocio.crearCompradoresNegocio().agregarComprador(comprador);
    }

}
