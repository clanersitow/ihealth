
package MODEL.agendaItinerario;


public class Cita {
    String idCita;
    String maticulaPaciente;
    String idCentroDeTrabajo;
    String nombreDoctor;
    String titulo;
    String descripcion;
    String fecha;
    String hora;
    boolean status; /*1 = actica, 0 = cancelada */
    
    
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
