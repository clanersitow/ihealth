/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.expediente;

/**
 *
 * @author ortega
 */
public class HojaDatosClinicos extends Documento{
    public int peso;
    public String tipoSanguineo;
    public int presionArterial;
    public int talla;
    
    public HojaDatosClinicos(String idDocumento, String matriculaPaciente, int peso, String tipoSanguineo, int presionArterial, int talla) {
        super(idDocumento, matriculaPaciente);
        this.peso = peso;
        this.tipoSanguineo = tipoSanguineo;
        this.presionArterial = presionArterial;
        this.talla = talla;
    }
    
}
