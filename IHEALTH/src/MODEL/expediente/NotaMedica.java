
package MODEL.expediente;


public class NotaMedica extends Documento{
    String numeroEmpleado;
    String notaDelMedico;
    
    public NotaMedica(String idDocumento, String matriculaPaciente, String numeroDeEmpleado, String notaDelMedico) {
        super(idDocumento, matriculaPaciente);
        this.numeroEmpleado = numeroEmpleado;
        this.notaDelMedico = notaDelMedico;
    }
    
}
