
package atividadecadastro;

import java.time.LocalDate;


public class Engenheiro extends Funcionario {
    private String crea;
    
    // construtor
    
     public Engenheiro(String crea, String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadoCivil, dataNascimento, id, nome, telefone, email, endereco);
        this.crea = crea;
    }
     
    // getter e setter
     
     public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
    
    // to string

    @Override
    public String toString() {
        return "\n Engenheiro: " + 
                super.toString() +
                "\n CREA: " + crea;
    }

   

   
    
    
}
