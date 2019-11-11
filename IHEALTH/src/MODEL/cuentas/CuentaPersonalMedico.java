
package MODEL.cuentas;

public class CuentaPersonalMedico extends Cuenta{
    
    String numeroEmpleado;
    String nombre;
    String apellido;
    String telefono;
    float salario;
    
    public CuentaPersonalMedico(String contraseña, String numeroEmpleado, String nombre, String apellido, float salario, String telefono){
        super(contraseña);
        this.numeroEmpleado = numeroEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.telefono = telefono;
    }
}
