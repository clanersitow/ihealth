
package MODEL.cuentas;


public class CuentaEnfermera extends CuentaPersonalMedico{
    String idCentroTrabajo;
    
    public CuentaEnfermera(String contraseña, String numeroEmpleado, String nombre, String apellido, float salario, String telefono, String idCentroTrabajo){
        super(contraseña, numeroEmpleado, nombre, apellido, salario, telefono);
        this.idCentroTrabajo = idCentroTrabajo;
    }
}
