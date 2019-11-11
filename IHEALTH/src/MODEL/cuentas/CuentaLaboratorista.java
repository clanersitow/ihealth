
package MODEL.cuentas;


public class CuentaLaboratorista extends CuentaPersonalMedico{
    String idLaboratorio;
    
    public CuentaLaboratorista(String contraseña, String numeroEmpleado, String nombre, String apellido, float salario, String telefono, String idLaboratorio){
        super(contraseña, numeroEmpleado, nombre, apellido, salario, telefono);
        this.idLaboratorio = idLaboratorio;
    }
}
