
package MODEL.pagos;



public class Transaccion {
    String idTransaccion;
    String numeroEmpleado;
    int monto;
    String fecha;
    boolean tipo; /*false= ingreso, true= egreso*/
    
    public Transaccion(String idTransaccion, String numeroEmpleado, int monto, String fecha, boolean tipo){
        this.idTransaccion = idTransaccion;
        this.numeroEmpleado = numeroEmpleado;
        this.monto = monto;
        this.fecha = fecha;
        this.tipo = tipo;
    }
}
