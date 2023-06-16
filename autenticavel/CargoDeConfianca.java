 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autenticavel;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public abstract class CargoDeConfianca extends Funcionario {
    protected Bonificacao bonificacao;

    
    //construtor
    public CargoDeConfianca(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salario, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, salario, dataNascimento, dataAdmissao);
        this.bonificacao = bonificacao;
    }

    // getter e setter

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    
}
