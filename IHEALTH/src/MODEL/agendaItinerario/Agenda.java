
package MODEL.agendaItinerario;

import java.util.ArrayList;
import java.util.Iterator;

public class Agenda {
    public ArrayList<Cita> citas;
    
    
    public Agenda(){
        this.citas = new ArrayList<Cita> ();

    }
    public Agenda(ArrayList<Cita> citas){
        
        this.citas = new ArrayList<Cita> ();
        this.citas = citas;
    }
    
    public void agregarCita (Cita nuevaCita){
        citas.add(nuevaCita);
    }
    
    public void eliminarCita (String idCita){
        Iterator iter;
        iter = citas.iterator(); 
        Cita actual = citas.get(0);
        int i = 0;
        
        while(iter.hasNext() && (actual.idCita).equals(idCita) == false){
            actual = (Cita) iter.next();
            i++;
        }
        
        if(actual.idCita.equals(idCita) ){
            citas.remove(i);
        }
    }
    
    public void printAgenda(){
        Iterator iter;
        iter = citas.iterator(); 
        Cita actual = citas.get(0);
 
        
        while(iter.hasNext()){
            actual = (Cita) iter.next();
            System.out.println("**********Cita*************");
            System.out.println("cita: " + actual.idCita);
            System.out.println("paciente: " + actual.maticulaPaciente);
            System.out.println("titulo: " + actual.titulo);
            System.out.println("clave centro: " + actual.idCentroDeTrabajo);
            System.out.println("fecha: " + actual.fecha);
            System.out.println("descripcion: " + actual.descripcion);
            System.out.println();
        }
        
    }
}
