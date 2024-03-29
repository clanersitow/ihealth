
package MODEL.agendaItinerario;

import java.util.ArrayList;
import java.util.Iterator;

public class Itinerario {
    ArrayList<Actividad> actividades;
    
    public Itinerario(){
        this.actividades = new ArrayList<Actividad>();
    }
    public Itinerario(ArrayList<Actividad> actividades){
        this.actividades = new ArrayList<Actividad>();
        this.actividades = actividades;
    }
    
    public void agregarActividad(Actividad nuevaActividad){
        actividades.add(nuevaActividad);
    }
    
    
    public void eliminarActividad(String idActividad){
        Iterator iter;
        iter = actividades.iterator(); 
        Actividad actual = actividades.get(0);
        int i = 0;
        
        while(iter.hasNext() && (actual.idActividad).equals(idActividad) == false){
            actual = (Actividad) iter.next();
            i++;
        }
        
        if(actual.idActividad.equals(idActividad) ){
            actividades.remove(i);
        }
    }
   
}
