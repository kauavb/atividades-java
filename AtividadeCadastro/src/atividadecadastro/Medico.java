
package atividadecadastro;

import java.time.LocalDate;


public class Medico extends Funcionario {
    private String crm;
    
    // construtor
    
    public Medico(String crm, String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadoCivil, dataNascimento, id, nome, telefone, email, endereco);
        this.crm = crm;
    }
    
    // getter e setter
    
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

     // to string
    
    @Override
    public String toString() {
        return  
                super.toString() +
               "\n CRM: " + crm;
    }

    
 
    
    
}
