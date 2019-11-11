
package MODEL.recetas;

import java.util.ArrayList;
import java.util.Iterator;

public class Receta {
    String matriculaPaciente;
    String idReceta;
    ArrayList <Medicamento> medicamentos;
    
    public Receta(String matriculaPaciente, String idReceta){
        medicamentos = new ArrayList<Medicamento>();
    }
    
    public Receta(String matriculaPaciente, String idReceta, ArrayList<Medicamento> medicamentos){
        this.medicamentos = new ArrayList<Medicamento>();
        this.medicamentos = medicamentos;
        this.idReceta = idReceta;
        this.matriculaPaciente = matriculaPaciente;
    }
    
    public void agregarMedicamento(Medicamento nuevoMedicamento){
        medicamentos.add(nuevoMedicamento);
    }
    
    public void elimninarMedicamento(String idMedicamento){
        Iterator iter;
        iter = medicamentos.iterator(); 
        Medicamento actual = medicamentos.get(0);
        int i = 0;
        
        while(iter.hasNext() && (actual.idMedicamento).equals(idMedicamento) == false){
            actual = (Medicamento) iter.next();
            i++;
        }
        
        if(actual.idMedicamento.equals(idMedicamento) ){
            medicamentos.remove(i);
        }
    }
}
