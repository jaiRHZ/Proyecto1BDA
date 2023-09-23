package interfacesDAO;

import dominio.Carrito;

/**
 *
 * @author HP
 */
public interface ICarritoDAO {
    
    public Carrito agregarCompra(Carrito carrito);
    
    public void eliminarCompra(Carrito carrito);
    
    public Carrito actualizarCompra(Carrito carrito);
    
    public Carrito consultarCompra(Carrito carrito);
}
