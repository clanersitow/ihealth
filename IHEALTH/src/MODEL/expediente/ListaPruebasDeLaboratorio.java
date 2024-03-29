
package MODEL.expediente;
import java.util.ArrayList;
import java.util.Iterator;

public class ListaPruebasDeLaboratorio {
    ArrayList<PruebaDeLaboratorio> pruebas;
    
    public ListaPruebasDeLaboratorio(){
        pruebas = new ArrayList<PruebaDeLaboratorio>();
    }
    public ListaPruebasDeLaboratorio(ArrayList<PruebaDeLaboratorio> pruebas){
        this.pruebas = new ArrayList<PruebaDeLaboratorio>();
        this.pruebas = pruebas;
    }
    
    public void agregarPrueba(PruebaDeLaboratorio nuevaPrueba){
        pruebas.add(nuevaPrueba);
    }
    
    public void eliminarPrueba (String idDocumento){
        Iterator iter;
        iter = pruebas.iterator(); 
        PruebaDeLaboratorio actual = pruebas.get(0);
        int i = 0;
        
        while(iter.hasNext() && (actual.idDocumento).equals(idDocumento) == false){
            actual = (PruebaDeLaboratorio) iter.next();
            i++;
        }
        
        if(actual.idDocumento.equals(idDocumento) ){
            pruebas.remove(i);
        }
    }
    
}
