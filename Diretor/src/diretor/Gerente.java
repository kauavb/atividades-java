
package diretor;

import java.time.LocalDate;

public class Gerente extends CargoDeConfianca {


    //metodo get salario final 
    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal += super.salarioBase * super.bonifacao.valor;
        salarioFinal += super.salarioBase;
        
        return salarioFinal;
    }
    
    // construtor

    public Gerente(Bonificacao bonifacao, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(bonifacao, nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
    }
   
    
    //metodo to string
    @Override
    public String toString() {
        return "\n Gerente: " + super.toString();
    }

    
    
    
    }

    
    
    
    
    

