
package diretor;

import java.time.LocalDate;


public class Diretor extends CargoDeConfianca {

    private final double PREMIO = 0.1; // = 10%

    // construtor

    public Diretor(Bonificacao bonifacao, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(bonifacao, nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
    }
    
   

    // get salariofinal
    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal += super.salarioBase * super.bonifacao.valor;
        salarioFinal += super.salarioBase * PREMIO;
        salarioFinal += super.salarioBase;
        
        return salarioFinal;
    }
    
    // getter

    public double getPREMIO() {
        return PREMIO;
    }
    
    // to string 

    @Override
    public String toString() {
        return  "\n Diretor: " + 
                super.toString() +
                "\n PREMIO: " + PREMIO;
    }
    
    
    
    
}
