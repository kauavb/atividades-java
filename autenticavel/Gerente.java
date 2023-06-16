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
public class Gerente extends CargoDeConfianca implements Autenticavel {

    // construtor
    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salario, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, salario, dataNascimento, dataAdmissao);
    }

    // metodo salario final
    @Override
    public double getSalarioFinal() {
        return (salario * bonificacao.valor);
    }

    // to string
    @Override
    public String toString() {
        return "\n Gerente: " + super.toString();
    }

   
    
    
    
}
