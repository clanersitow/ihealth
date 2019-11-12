
package MODEL.expediente;

public class HistoriaClinica extends Documento{
    public String sexo;
    public String antecedentesFamiliares;
    public String antecedentesPersonales;
    public String fechaDeNacimiento;
    
    public HistoriaClinica(String idDocumento, String matriculaPaciente, String sexo, String antecedentesFamiliares, String antecedentesPersonales, String fechaDeNacimiento ) {
        super(idDocumento, matriculaPaciente);
        this.sexo = sexo;
        this.antecedentesFamiliares = antecedentesFamiliares;
        this.antecedentesPersonales = antecedentesPersonales;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
}
