/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciones;

import excepciones.SQLException;
import interfacesDAO.IVideojuegosDAO;
import conexionBD.*;
import dominio.Videojuego;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class VideojuegoDAO implements IVideojuegosDAO {

    private final IConexionBD conexionBD;

    public VideojuegoDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }

    @Override
    public Videojuego guardarVideojuego(Videojuego videojuego) throws SQLException {
        String sql = "insert into videojuegos(estudio, clasificacion, titulo, genero) values(?,?,?,?)";

        try (Connection conexion = conexionBD.getConnection();
                PreparedStatement comando = conexion.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);) {
            comando.setString(1, videojuego.getEstudio());
            comando.setString(2, videojuego.getClasificacion());
            comando.setString(3, videojuego.getTitulo());
            comando.setString(4, videojuego.getGenero());
            comando.executeUpdate();
            ResultSet rs = comando.getGeneratedKeys();
            while (rs.next()) {
                int claveGenerada = rs.getInt(1);
                videojuego.setId(claveGenerada);
                JOptionPane.showMessageDialog(null, "Videojuego Guardado con EXITO");
                return videojuego;
            }
        } catch (Exception ex) {

            throw new SQLException("No se pudo guardar el videojuego " + ex.getMessage());
        }
        return null;
    }

}
