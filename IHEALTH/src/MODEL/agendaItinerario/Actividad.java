
package MODEL.agendaItinerario;


public class Actividad {
    public String idActividad;
    public String numeroEmpleado;
    public String titulo;
    public String descripcion;
    public String fecha;
    public String hora;
    
    
    public Actividad(String idActividad, String numeroEmpleado, String titulo, String descripcion, String fecha, String hora){
        this.idActividad = idActividad;
        this.numeroEmpleado = numeroEmpleado;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
    }
    
    
}
