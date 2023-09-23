/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesDAO;

import dominio.Copia;

/**
 *
 * @author HP
 */
public interface ICopiasDAO {
    
    public Copia agregarCopia(Copia copia);
    
    public void eliminarCopia(Copia copia);
    
    public Copia actualizarCopia(Copia copia);
    
    public Copia consultarCopia(Copia copia);
    
}
