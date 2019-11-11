
package MODEL.recetas;

import java.util.ArrayList;
import java.util.Iterator;

public class Recetario {
    ArrayList <Receta> recetas;
    
    public Recetario(){
        recetas = new ArrayList<Receta>();
    }
    
    public Recetario(ArrayList<Receta> recetas){
        this.recetas = new ArrayList<Receta>();
        this.recetas = recetas;
    }
    
    public void agregarReceta(Receta nuevaReceta){
        recetas.add(nuevaReceta);
    }
    
    public void eliminarReceta(String idReceta){
        Iterator iter;
        iter = recetas.iterator(); 
        Receta actual = recetas.get(0);
        int i = 0;
        
        while(iter.hasNext() && (actual.idReceta).equals(idReceta) == false){
            actual = (Receta) iter.next();
            i++;
        }
        
        if(actual.idReceta.equals(idReceta) ){
            recetas.remove(i);
        }
    }
}
