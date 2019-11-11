
package MODEL.instalaciones;

import java.util.ArrayList;
import java.util.Iterator;

public class DirectorioDeHospitales {
    ArrayList<Hospital> hospitales;
    
    public DirectorioDeHospitales(){
        hospitales = new ArrayList<Hospital> ();
    }
    
    public DirectorioDeHospitales(ArrayList<Hospital> hospitales){
        hospitales = new ArrayList<Hospital> ();
        this.hospitales = hospitales;
    }
    
    public void agregarHospital(Hospital nuevoHospital){
        hospitales.add(nuevoHospital);
    }
    
    public void eliminarHospital(String idCentroDeTrabajo){
        Iterator iter;
        iter = hospitales.iterator(); 
        Hospital actual = hospitales.get(0);
        int i = 0;
        
        while(iter.hasNext() && (actual.idCentroDeTrabajo).equals(idCentroDeTrabajo) == false){
            actual = (Hospital) iter.next();
            i++;
        }
        
        if(actual.idCentroDeTrabajo.equals(idCentroDeTrabajo) ){
            hospitales.remove(i);
        }
    }
    
    public void printDirectorioDeHospitales(){
        Iterator iter;
        iter = hospitales.iterator(); 
        Hospital actual;
        actual = hospitales.get(0);

        
        while(iter.hasNext()){
            actual = (Hospital) iter.next();
            System.out.println("*****Hospital*****");
            System.out.println("idHospital: " + actual.idCentroDeTrabajo);
            System.out.println("nombre: " + actual.nombre);
            System.out.println("ubicacion: " + actual.ubicacion);
            System.out.println("numero de laboratorios: " + actual.laboratorios.size());
            System.out.println("numero de centros de alta especialidad: " + actual.centrosAltaEspecialidad.size());
            System.out.println();
        }
        
    }
}
