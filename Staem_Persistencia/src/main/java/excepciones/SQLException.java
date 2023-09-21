/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Jairo G. Rodriguez Hernandez 00000213248
 */
public class SQLException extends Exception {

    public SQLException() {
    }

    public SQLException(String string) {
        super(string);
    }

    public SQLException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public SQLException(Throwable thrwbl) {
        super(thrwbl);
    }

    public SQLException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
    
}
