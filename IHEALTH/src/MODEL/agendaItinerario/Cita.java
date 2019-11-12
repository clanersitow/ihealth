
package MODEL.agendaItinerario;


public class Cita {
    public String idCita;
    public String maticulaPaciente;
    public String idCentroDeTrabajo;
    public String nombreDoctor;
    public String titulo;
    public String descripcion;
    public String fecha;
    public String hora;
    public boolean status; /*1 = actica, 0 = cancelada */
    
    
    public Cita(String idCita, String matriculaPaciente, String nombreDoctor, String idCentroDeTrabajo, String titulo, String descripcion, String fecha, String hora){
        this.idCita = idCita;
        this.maticulaPaciente = matriculaPaciente;
        this.idCentroDeTrabajo = idCentroDeTrabajo;
        this.nombreDoctor = nombreDoctor;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.status = true;
    }
    
    public void cancelarCita(){
        status = false;
    }
    
    
}
