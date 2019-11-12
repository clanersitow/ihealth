
package MODEL.cuentas;



public class CuentaPaciente extends Cuenta{
    public String matricula;
    public String nombre;
    public String correo;
    public String apellido;
    public String codigoPostal;
    public String fechaNacimiento;
    
    public CuentaPaciente(String matricula, String contraseña, String correo, String nombre, String apellido, String codigoPostal, String fechaNacimiento){
        super(contraseña);
        this.correo = correo;
        this.matricula =       matricula;
        this.nombre =          nombre;
        this.apellido =        apellido;
        this.codigoPostal =    codigoPostal;
        this.fechaNacimiento = fechaNacimiento;
    }
}
