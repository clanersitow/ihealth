
package MODEL.cuentas;



public class SolicitudCuentaPaciente {
 
    public String nombre;
    public String correo;
    public String apellido;
    public String codigoPostal;
    public String fechaNacimiento;
    
    public SolicitudCuentaPaciente(String correo, String nombre, String apellido, String codigoPostal, String fechaNacimiento){
        this.correo = correo;
        this.nombre =          nombre;
        this.apellido =        apellido;
        this.codigoPostal =    codigoPostal;
        this.fechaNacimiento = fechaNacimiento;
    }
}
