
package MODEL.cuentas;


public class CuentaRecepcionista extends CuentaPersonalAdministrativo{
    
    public String idCentroTrabajo;
    
     public CuentaRecepcionista(String numeroEmpleado, String contraseña, String nombre, String apellido, float salario, String telefono, String idCentroTrabajo){
        super(numeroEmpleado, contraseña, nombre, apellido, salario, telefono);
        this.idCentroTrabajo = idCentroTrabajo;
    }
    
}