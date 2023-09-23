
package interfacesDAO;

import dominio.Compra;
import excepciones.SQLException;

/**
 *
 * @author HP
 */
public interface IComprasDAO {
    
    public Compra agregarCompra(Compra compra) throws SQLException;
    
    public void eliminarCompra(Compra compra) throws SQLException;
    
    public Compra actualizarCompra(Compra compra) throws SQLException;
    
    public Compra consultarCompra(Compra compra) throws SQLException;
    
}
