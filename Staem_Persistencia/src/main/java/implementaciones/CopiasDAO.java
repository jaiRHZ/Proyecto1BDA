/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import conexionBD.IConexionBD;
import dominio.Copia;
import excepciones.SQLException;
import interfacesDAO.ICopiasDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

import dominio.Copia;
import dominio.Videojuego;
import interfacesDAO.ICopiasDAO;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class CopiasDAO implements ICopiasDAO {

    private final IConexionBD conexionBD;

    public CopiasDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }

    @Override
    public Copia agregarCopia(Copia copia) throws SQLException {
        String sql = "insert into copias(precio, idJuego) values(?, ?)";

        try (Connection conexion = conexionBD.getConnection();
                PreparedStatement comando = conexion.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);) {

            comando.setFloat(1, copia.getPrecio());
            comando.setInt(2, copia.getVideojuego().getId());
            comando.executeUpdate();
            ResultSet rs = comando.getGeneratedKeys();

            while (rs.next()) {
                int claveGenerada = rs.getInt(1);
                copia.setId(claveGenerada);
                JOptionPane.showMessageDialog(null, "Copia Guardada con EXITO");
                return copia;
            }
        } catch (Exception ex) {

            throw new SQLException("No se pudo guardar la copia " + ex.getMessage());
        }
        return null;

    }

    @Override
    public void eliminarCopia(Copia copia) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Copia actualizarCopia(Copia copia) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Copia consultarCopia(Integer id) throws SQLException {
        String sql = "select * from copias where idCopia = ?";
        try (Connection conexion = conexionBD.getConnection();
                PreparedStatement comando = conexion.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);) {
            comando.setInt(1, id);
            ResultSet resultado = comando.executeQuery();
            if (resultado.next()) {
                Copia copia = new Copia();
                copia.setId(resultado.getInt("idCopia"));
                copia.setPrecio(resultado.getFloat("precio"));
                copia.setVideojuego(this.consultarVideojuego(resultado.getInt("idVideojuego")));
                return copia;
            }
        } catch (Exception ex) {

            throw new SQLException("No se pudo consultar la copia " + ex.getMessage());
        }
        return null;
    }

    public Videojuego consultarVideojuego(Integer id) {
        String sql = "select * from videojuegos where idJuego = ?";
        try (Connection conexion = conexionBD.getConnection();
                PreparedStatement comando = conexion.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);) {
            comando.setInt(1, id);
            ResultSet resultado = comando.executeQuery();
            if (resultado.next()) {
                Videojuego videojuego = new Videojuego();
                videojuego.setId(resultado.getInt("idJuego"));
                videojuego.setTitulo(resultado.getString("titulo"));
                return videojuego;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
