
package MODEL.expediente;

public class HistoriaClinica extends Documento{
    String sexo;
    String antecedentesFamiliares;
    String antecedentesPersonales;
    String fechaDeNacimiento;
    
    public HistoriaClinica(String idDocumento, String matriculaPaciente, String sexo, String antecedentesFamiliares, String antecedentesPersonales, String fechaDeNacimiento ) {
        super(idDocumento, matriculaPaciente);
        this.sexo = sexo;
        this.antecedentesFamiliares = antecedentesFamiliares;
        this.antecedentesPersonales = antecedentesPersonales;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
}
