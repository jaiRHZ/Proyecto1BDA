/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesDAO;

import dominio.Compra;

/**
 *
 * @author HP
 */
public interface IComprasDAO {
    
    public Compra agregarCompra(Compra compra);
    
    public void eliminarCompra(Compra compra);
    
    public Compra actualizarCompra(Compra compra);
    
    public Compra consultarCompra(Compra compra);
    
}
