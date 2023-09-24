package dominio;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Domicilio {

    private String calle;
    private String numero;
    private String codigoPostal;

    public Domicilio() {
    }

    public Domicilio(String calle, String numero, String codigoPostal) {
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Domicilio{" + "calle=" + calle + ", numero=" + numero + ", codigoPostal=" + codigoPostal + '}';
    }

}
