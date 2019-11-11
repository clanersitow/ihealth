
package MODEL.agendaItinerario;
import java.util.ArrayList;
import java.util.Iterator;

public class AgendaPaciente extends Agenda{
    
    public AgendaPaciente(){
        super();
    }
    
    public AgendaPaciente(ArrayList<Cita> citas){
        super(citas);
    }
    
}
