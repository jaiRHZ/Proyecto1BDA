
package dominio;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Credencial {
    
    private int id;
    private String usuario;
    private String contrasenya;

    public Credencial() {
    }

    public Credencial(String usuario, String contrasenya) {
        this.usuario = usuario;
        this.contrasenya = contrasenya;
    }

    public Credencial(int id, String usuario, String contrasenya) {
        this.id = id;
        this.usuario = usuario;
        this.contrasenya = contrasenya;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    @Override
    public String toString() {
        return "Credencial{" + "id=" + id + ", usuario=" + usuario + ", contrasenya=" + contrasenya + '}';
    }
    
    
}
