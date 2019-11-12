
package MODEL.gestores;

import MODEL.proxysTablas.cuentas.ProxyTablaCuentasPacientes;
import MODEL.cuentas.*;
import MODEL.expediente.*;
import MODEL.proxysTablas.expediente.*;

public class MedicoAnadirHojaDeEnfermeria {
    
    public static void main(String[] args) {
        
        HojaDeEnfermeria hoja = null;
        String nombrePaciente = "nombre";
        String apellidoPaciente = "apellido";
        
         ///Solicita la cuenta de un del paciente con el nombre y apellido dados a la bse de datos
        CuentaPaciente cuenta = ProxyTablaCuentasPacientes.getCuentaPaciente(nombrePaciente, apellidoPaciente);
        
        
        ///Solicita los datos para crear una nueva hoja de enfermeria 
        String idDocuento = "";
        String matriculaPaciente = cuenta.matricula;
        String notaDeEnfermeria = "Notas notas notas";
        int peso = 70;
        int estatura = 170; 
        
                
        hoja = new HojaDeEnfermeria(idDocuento, matriculaPaciente, notaDeEnfermeria, peso, estatura);
        
        ProxyTablaHojasDeEnfermeria.insertarNuevaHojaDeEnfermeria(hoja);
     }
}
