
package MODEL.cuentas;


public class CuentaMedico extends CuentaPersonalMedico{
    String licenciatura;
    String especialidad;
    String departamento;
    String almaMater;
    String idCentroTrabajo;
    
    public CuentaMedico(String contraseña, String numeroEmpleado, String nombre, String apellido, float salario, String telefono, String licenciatura, String especialidad, String departamento, String almaMater, String idCentroTrabajo){
        super(contraseña, numeroEmpleado, nombre, apellido, salario, telefono);
        this.licenciatura = licenciatura;
        this.especialidad = especialidad;
        this.departamento = departamento;
        this.almaMater = almaMater;
        this.idCentroTrabajo = idCentroTrabajo;
    }
}
