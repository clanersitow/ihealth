
package MODEL.gestores;
import MODEL.proxysTablas.cuentas.ProxyTablaCuentasPacientes;
import MODEL.cuentas.*;
import MODEL.proxysTablas.expediente.*;

public class MedicoAnadirNuevoDocumentoAUnExpediente {
    
     public static void main(String[] args) {
         
        String nombrePaciente = "nombre";
        String apellidoPaciente = "apellido";
        
         ///Solicita la cuenta de un del paciente con el nombre y apellido dados a la bse de datos
        CuentaPaciente cuenta = ProxyTablaCuentasPacientes.getCuentaPaciente(nombrePaciente, apellidoPaciente);
        
     }
    
    
    
}
