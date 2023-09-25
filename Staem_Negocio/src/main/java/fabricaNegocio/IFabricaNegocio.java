/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaNegocio;

import negocio.CompradoresNegocio;
import negocio.CopiasNegocio;
import negocio.CompraNegocio;

/**
 *
 * @author HP
 */
public interface IFabricaNegocio {

    public CompradoresNegocio crearCompradoresNegocio();

    public CopiasNegocio crearCopiassNegocio();

    public CompraNegocio crearCompraNegocio();

}
