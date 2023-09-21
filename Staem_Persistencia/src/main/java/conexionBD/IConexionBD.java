
package conexionBD;

import excepciones.SQLException;
import java.sql.Connection;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public interface IConexionBD {
    
    
    public Connection getConnection()throws SQLException;
}
