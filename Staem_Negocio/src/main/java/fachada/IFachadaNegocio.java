/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import dominio.Comprador;

/**
 *
 * @author HP
 */
public interface IFachadaNegocio {

    public Comprador agregarComprador(Comprador comprador);

    public Comprador consultarComprador(Comprador comprador);
}
