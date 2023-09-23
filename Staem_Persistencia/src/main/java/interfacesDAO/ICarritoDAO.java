package interfacesDAO;

import dominio.Carrito;
import excepciones.SQLException;

/**
 *
 * @author HP
 */
public interface ICarritoDAO {
    
    public Carrito agregarCompra(Carrito carrito) throws SQLException;
    
    public void eliminarCompra(Carrito carrito) throws SQLException;
    
    public Carrito actualizarCompra(Carrito carrito) throws SQLException;
    
    public Carrito consultarCompra(Carrito carrito) throws SQLException;
}
