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
public class Diretor extends CargoDeConfianca implements Autenticavel {
    private final double premio = 0.1;
    
    // construror

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salario, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, salario, dataNascimento, dataAdmissao);
    }
    
    // get salario

    @Override
    public double getSalarioFinal() {
       return (salario + salario * bonificacao.valor + salario * premio);
    }
    
    // to string

    @Override
    public String toString() {
        return "\n Diretor" + 
               "\n Salario: " + getSalarioFinal() +
                super.toString() +
               "\n Premio: " + premio;
    }
    
    
    
    
}
