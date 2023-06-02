
package diretor;

import java.time.LocalDate;


public abstract class CargoDeConfianca extends Funcionario  {
    
    protected Bonificacao bonifacao;

    //construtor

    public CargoDeConfianca(Bonificacao bonifacao, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
        this.bonifacao = bonifacao;
    }
    

    //getter e setter
    public Bonificacao getBonifacao() {
        return bonifacao;
    }

    public void setBonifacao(Bonificacao bonifacao) {
        this.bonifacao = bonifacao;
    }

    //to string
    @Override
    public String toString() {
        return super.toString() +
                "\n Bonificação: " + bonifacao.valor;
    }
    
    
}
