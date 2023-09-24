package conexionBD;

import excepciones.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class ConexionMySQL implements IConexionBD {

    private Connection connectionBD;
    private String contrasenya = "daniel2002";
    private String usuario = "root";
    private String HOST = "localhost";
    private String PORT = "3306";
    private String DATABASE = "tiendaVideojuegos";
    private String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE;

    @Override
    public Connection getConnection() throws SQLException {
        try {
            if (connectionBD == null || connectionBD.isClosed()) {
                connectionBD = DriverManager.getConnection(URL, usuario, contrasenya);
            }
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connectionBD;
    }

}
