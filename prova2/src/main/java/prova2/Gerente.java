/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova2;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Gerente extends CargoDeConfianca{

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento, String logradouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa uf) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento, logradouro, numero, complemento, cep, cidade, uf);
    }

   

    // metodo get salariofinal
    @Override
    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal += salario * bonificacao.getValor();
        salarioFinal += salario;
        
        return salarioFinal;
    }

    @Override
    public String toString() {
        return 
                "\n Gerente: " + 
                super.toString();
    }
    
    
    
   

  
}
