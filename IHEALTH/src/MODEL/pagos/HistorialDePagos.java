
package MODEL.pagos;

import java.util.ArrayList;
import java.util.Iterator;

public class HistorialDePagos {
    ArrayList <Pago> pagos;
    
    public HistorialDePagos(){
        pagos = new ArrayList<Pago>();
    }
    
    public HistorialDePagos(ArrayList<Pago> pagos){
        this.pagos = new ArrayList<Pago>();
        this.pagos = pagos;

    }
    
    public void agregarPago(Pago nuevoPago){
        pagos.add(nuevoPago);
    }
    
    public void eliminarPago(String idPago){
        Iterator iter;
        iter = pagos.iterator(); 
        Pago actual = pagos.get(0);
        int i = 0;
        
        while(iter.hasNext() && (actual.idPago).equals(idPago) == false){
            actual = (Pago) iter.next();
            i++;
        }
        
        if(actual.idPago.equals(idPago) ){
            pagos.remove(i);
        }
    }
    
}
