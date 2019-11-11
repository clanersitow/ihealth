
package MODEL.expediente;

public class HojaDeEnfermeria extends Documento{
    String notaEnfermeria;
    int peso;
    int talla;
            
    public HojaDeEnfermeria(String idDocumento, String matriculaPaciente, String notaEnfermeria, int peso, int talla) {
        super(idDocumento, matriculaPaciente);
        this.notaEnfermeria = notaEnfermeria;
        this.peso = peso;
        this.talla = talla;
    }
    
    
    
}
