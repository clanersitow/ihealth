
package MODEL.expediente;


public class PruebaDeLaboratorio extends Documento{
    String nombrePrueba;
    String idLaboratorio;
    String resultado;
    
    public PruebaDeLaboratorio(String idDocumento, String matriculaPaciente, String idLaboratorio, String nombrePrueba, String resultado) {
        super(idDocumento, matriculaPaciente);
        this.idLaboratorio = idLaboratorio;
        this.nombrePrueba = nombrePrueba;
        this.resultado = resultado;
    }
    
}
