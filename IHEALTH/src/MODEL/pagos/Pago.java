
package MODEL.pagos;


public class Pago {
    String idPago;
    String matriculaPaciente;
    int monto;
    String fecha;
    String nombreDelCargo;
    boolean status; /*no pagado:=false, pagado:=true*/
    
    public Pago(String idPago, String matriculaPaciente, int monto, String fecha, String nombreDelCargo){
        this.idPago = idPago;
        this.matriculaPaciente = matriculaPaciente;
        this.monto = monto;
        this.fecha = fecha;
        this.nombreDelCargo = nombreDelCargo;
        status = false;
    }
    
    public void registrarComoPagado(){
        status = true;
    }
}
