/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import dominio.*;
import java.util.List;

/**
 *
 * @author HP
 */
public interface IFachadaPersistencia {

    //Compradores
    public Comprador agregarComprador(Comprador comprador);

    public Comprador consultarComprador(Comprador comprador);

    public Copia consultarCopia(Integer id);

    public Compra agregarCompra(Compra compra, List<Copia> copias);
}
