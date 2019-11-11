
package MODEL.eventos;
import java.util.ArrayList;
import java.util.Iterator;

public class Cartelera {
    ArrayList<Evento> eventos;
    
    private Iterator<Evento> iter;
    
    public Cartelera(){
        eventos = new ArrayList<Evento>();
    }
    
    public Cartelera(ArrayList<Evento> eventos){
        eventos = new ArrayList<Evento>();
        this.eventos = eventos;
    }
    
    public void agregarEvento(Evento nuevoEvento){
        eventos.add(nuevoEvento);
    }
    
    public void eliminarEvento(String idEvento){
        iter = eventos.iterator(); 
        Evento actual = eventos.get(0);
        int i = 0;
        
        while(iter.hasNext() && (actual.idEvento).equals(idEvento) == false){
            actual = (Evento) iter.next();
            i++;
        }
        
        if(actual.idEvento.equals(idEvento) ){
            eventos.remove(i);
        }
    }
    
    public void printEventos(){
        iter = eventos.iterator(); 
        Evento actual;
        while(iter.hasNext()){
            actual = iter.next();
            System.out.println(actual.titulo);
            System.out.println(actual.descripcion);
            System.out.println();
        }
        
    }
}
