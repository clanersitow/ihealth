
package MODEL.cuentas;


public class CuentaMedico extends CuentaPersonalMedico{
    String especialidad;
    String departamento;
    String almaMater;
    String idCentroTrabajo;
    
    public CuentaMedico(String contraseña, String numeroEmpleado, String nombre, String apellido, float salario, String telefono, String especialidad, String departamento, String almaMater, String idCentroTrabajo){
        super(contraseña, numeroEmpleado, nombre, apellido, salario, telefono);
        this.especialidad = especialidad;
        this.departamento = departamento;
        this.almaMater = almaMater;
        this.idCentroTrabajo = idCentroTrabajo;
    }
}
