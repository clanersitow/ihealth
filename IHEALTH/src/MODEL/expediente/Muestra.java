
package MODEL.expediente;


public class Muestra extends Documento{
    String tipoDeMuestra;
    String resultado;
    
    public Muestra(String idDocumento, String matriculaPaciente, String tipoDeMuestra, String resultado) {
        super(idDocumento, matriculaPaciente);
        this.tipoDeMuestra = tipoDeMuestra;
        this.resultado = resultado;
    }
    
}
