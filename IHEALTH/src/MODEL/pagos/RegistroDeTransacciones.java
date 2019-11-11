
package MODEL.pagos;

import java.util.ArrayList;
import java.util.Iterator;

public class RegistroDeTransacciones {
    ArrayList<Transaccion> transacciones;
    
    public RegistroDeTransacciones(){
        transacciones = new ArrayList<Transaccion>();
    }
    
    public RegistroDeTransacciones(ArrayList<Transaccion> transacciones){
        this.transacciones = new ArrayList<Transaccion>();
        this.transacciones = transacciones;
    }
    
    public void agregarTransaccion(Transaccion nuevaTransaccion){
        transacciones.add(nuevaTransaccion);
    }
    
    public void elimianrTransaccion(String idTransaccion){
        Iterator iter;
        iter = transacciones.iterator(); 
        Transaccion actual = transacciones.get(0);
        int i = 0;
        
        while(iter.hasNext() && (actual.idTransaccion).equals(idTransaccion) == false){
            actual = (Transaccion) iter.next();
            i++;
        }
        
        if(actual.idTransaccion.equals(idTransaccion) ){
            transacciones.remove(i);
        }
    }
}
