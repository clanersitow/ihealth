
package MODEL.eventos;


public class Evento {
    String idEvento;
    String titulo;
    String descripcion;
    String fecha;
    String ubicacion;
    String hora;
    
    public Evento(String idEvento, String titulo, String descripcion, String fecha, String ubicacion, String hora){
        this.idEvento = idEvento;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.hora = hora;
    }
}
