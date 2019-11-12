
package MODEL.agendaItinerario;
import java.util.ArrayList;
import java.util.Iterator;

public class AgendaPublicaLaboratorio extends Agenda{
    public String idLaboratorio;
    
    public AgendaPublicaLaboratorio(){
        super();
    }
    
    public AgendaPublicaLaboratorio(ArrayList<Cita> citas, String idLaboratorio){
        super(citas);
        this.idLaboratorio = idLaboratorio;
    }
    
}
