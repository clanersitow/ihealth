
package MODEL.instalaciones;

import java.util.ArrayList;
import java.util.Iterator;

public class Hospital {
    String idCentroDeTrabajo;
    String ubicacion;
    String nombre;
    ArrayList <Laboratorio> laboratorios;
    ArrayList <CentroDeAltaEspecialidad> centrosAltaEspecialidad;
    
    public Hospital(){
        laboratorios = new ArrayList<Laboratorio> ();
        centrosAltaEspecialidad = new ArrayList<CentroDeAltaEspecialidad>();
    }
    
    public Hospital(String idCentroDeTrabajo, String ubicacion, String nombre){
        laboratorios = new ArrayList<Laboratorio> ();
        centrosAltaEspecialidad = new ArrayList<CentroDeAltaEspecialidad>();
        this.idCentroDeTrabajo = idCentroDeTrabajo;
        this.ubicacion = ubicacion;
        this.nombre = nombre;
    }
    
    public Hospital(String idCentroDeTrabajo, String ubicacion, String nombre, ArrayList<Laboratorio> laboratorios, ArrayList<CentroDeAltaEspecialidad> centrosAltaEspecialidad){
        laboratorios = new ArrayList<Laboratorio> ();
        centrosAltaEspecialidad = new ArrayList<CentroDeAltaEspecialidad>();
        this.idCentroDeTrabajo = idCentroDeTrabajo;
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.laboratorios = laboratorios;
        this.centrosAltaEspecialidad = centrosAltaEspecialidad;
    }
    
    public void agregarLaboratorio(Laboratorio nuevoLaboratorio){
        laboratorios.add(nuevoLaboratorio);
    }
    
    public void agregarCentroDeAltaEspecialidad(CentroDeAltaEspecialidad nuevoCentro){
        centrosAltaEspecialidad.add(nuevoCentro);
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
    
    public void eliminarCentroDeAltaEspecialidad (String idCentroDeAltaEspecialidad){
        Iterator iter;
        iter = centrosAltaEspecialidad.iterator(); 
        CentroDeAltaEspecialidad actual = centrosAltaEspecialidad.get(0);
        int i = 0;
        
        while(iter.hasNext() && (actual.idCentroDeAltaEspecialidad).equals(idCentroDeAltaEspecialidad) == false){
            actual = (CentroDeAltaEspecialidad) iter.next();
            i++;
        }
        
        if(actual.idCentroDeAltaEspecialidad.equals(idCentroDeAltaEspecialidad) ){
            centrosAltaEspecialidad.remove(i);
        }
    }

    public void printHospital(){
            Iterator iter;
        
            System.out.println("*****Hospital*****");
            System.out.println("idHospital: " + idCentroDeTrabajo);
            System.out.println("nombre: " + nombre);
            System.out.println("ubicacion: " + ubicacion);
            System.out.println("-----Laboratorios-----");
            System.out.println("numero de laboratorios: " + laboratorios.size());

            iter = laboratorios.iterator(); 
            Laboratorio Lactual = laboratorios.get(0);
            while(iter.hasNext()){
                Lactual = (Laboratorio) iter.next();
                System.out.println("Laboratorio: " + Lactual.nombre);
            }
            
            
            System.out.println("-----Centros de Alta Especidalidad-----");
            System.out.println("numero de centros de alta especialidad: " + centrosAltaEspecialidad.size());
            iter = centrosAltaEspecialidad.iterator(); 
            CentroDeAltaEspecialidad Cactual = centrosAltaEspecialidad.get(0);
 
        
            while(iter.hasNext()){
                Cactual = (CentroDeAltaEspecialidad) iter.next();
                System.out.println("CentroDeAltaEspecialiadad: " + Cactual.nombre);
            }
            
            
            System.out.println();
    }
}
