
package MODEL.instalaciones;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaDeLaboratorios {
    ArrayList<Laboratorio> laboratorios;
    
    public ListaDeLaboratorios(){
        laboratorios = new ArrayList<Laboratorio>();
    }
    
    public ListaDeLaboratorios(ArrayList<Laboratorio> laboratorios){
        laboratorios = new ArrayList<Laboratorio>();
        this.laboratorios = laboratorios;
    }
    
    public void agregarLaboratorio(Laboratorio nuevoLaboratorio){
        laboratorios.add(nuevoLaboratorio);
    }
    
    public void eliminarLaboratorio(String idLaboratorio){
        Iterator iter;
        iter = laboratorios.iterator(); 
        Laboratorio actual = laboratorios.get(0);
        int i = 0;
        
        while(iter.hasNext() && (actual.idLaboratorio).equals(idLaboratorio) == false){
            actual = (Laboratorio) iter.next();
            i++;
        }
        
        if(actual.idLaboratorio.equals(idLaboratorio) ){
            laboratorios.remove(i);
        }
    }
    
    public void printListaDeLaboratorios(){
            Iterator iter;
        
           
            System.out.println("-----Laboratorios-----");
            System.out.println("numero de laboratorios: " + laboratorios.size());

            iter = laboratorios.iterator(); 
            Laboratorio Lactual;
            while(iter.hasNext()){
                Lactual = (Laboratorio) iter.next();
                System.out.println("Laboratorio: " + Lactual.nombre);
            }
            System.out.println();
    }
}
