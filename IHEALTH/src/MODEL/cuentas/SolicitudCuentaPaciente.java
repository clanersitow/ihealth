
package MODEL.cuentas;



public class SolicitudCuentaPaciente {
 
    String nombre;
    String correo;
    String apellido;
    String codigoPostal;
    String fechaNacimiento;
    
    public SolicitudCuentaPaciente(String correo, String nombre, String apellido, String codigoPostal, String fechaNacimiento){
        this.correo = correo;
        this.nombre =          nombre;
        this.apellido =        apellido;
        this.codigoPostal =    codigoPostal;
        this.fechaNacimiento = fechaNacimiento;
    }
}
