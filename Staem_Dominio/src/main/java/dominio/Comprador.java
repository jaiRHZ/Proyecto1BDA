package dominio;

import java.util.List;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class Comprador {

    private int id;
    private String email;
    private String nombres;
    private String aPaterno;
    private String aMaterno;

    private Domicilio domicilio;
    private Credencial credencial;
    private List<Compra> compras;

    public Comprador() {
    }

    public Comprador(String email, String nombres, String aPaterno, String aMaterno, Domicilio domicilio, Credencial credencial) {
        this.email = email;
        this.nombres = nombres;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.domicilio = domicilio;
        this.credencial = credencial;
    }

    public Comprador(int id, String email, String nombres, String aPaterno, String aMaterno, Domicilio domicilio, Credencial credencial) {
        this.id = id;
        this.email = email;
        this.nombres = nombres;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.domicilio = domicilio;
        this.credencial = credencial;
    }

    public Comprador(int id, String email, String nombres, String aPaterno, String aMaterno, Domicilio domicilio, Credencial credencial, List<Compra> compras) {
        this.id = id;
        this.email = email;
        this.nombres = nombres;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.domicilio = domicilio;
        this.credencial = credencial;
        this.compras = compras;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Credencial getCredencial() {
        return credencial;
    }

    public void setCredencial(Credencial credencial) {
        this.credencial = credencial;
    }

    @Override
    public String toString() {
        return "Comprador{" + "email=" + email + ", nombres=" + nombres + ", aPaterno=" + aPaterno + ", aMaterno=" + aMaterno + ", domicilio=" + domicilio + ", credencial=" + credencial + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Comprador other = (Comprador) obj;
        return this.id == other.id;
    }

}
