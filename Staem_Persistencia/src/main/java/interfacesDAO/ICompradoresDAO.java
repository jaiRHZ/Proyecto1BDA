/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesDAO;

import dominio.Comprador;

/**
 *
 * @author HP
 */
public interface ICompradoresDAO {
    
    public Comprador agregarComprador(Comprador comprador);
    
    public void eliminarComprador(Comprador comprador);
    
    public Comprador actualizarComprador(Comprador comprador);
    
    public Comprador consultarComprador(Comprador comprador);
}
