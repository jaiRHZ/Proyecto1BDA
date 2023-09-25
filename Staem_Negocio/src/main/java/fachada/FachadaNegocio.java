/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import dominio.Compra;
import fabricaNegocio.FabricaNegocio;
import dominio.Comprador;
import dominio.Copia;
import fabricaNegocio.IFabricaNegocio;
import java.util.List;

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

    @Override
    public Comprador consultarComprador(Comprador comprador) {
        return fabricaNegocio.crearCompradoresNegocio().consultarComprador(comprador);
    }

    @Override
    public Copia consultarCopia(Integer id) {
        return fabricaNegocio.crearCopiassNegocio().consultarCopia(id);
    }

    @Override
    public Compra agregarCompra(Compra compra, List<Copia> copias) {
        return fabricaNegocio.crearCompraNegocio().agregarCompra(compra, copias);
    }

}
