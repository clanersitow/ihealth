
package MODEL.cuentas;

public class CuentaPersonalAdministrativo extends Cuenta{
    String numeroEmpleado;
    String nombre;
    String apellido;
    float  salario;
    String telefono;
    
    public CuentaPersonalAdministrativo(String numeroEmpleado, String contraseña, String nombre, String apellido, float salario, String telefono){
        super(contraseña);
        this.numeroEmpleado = numeroEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.telefono = telefono;
    }
}
