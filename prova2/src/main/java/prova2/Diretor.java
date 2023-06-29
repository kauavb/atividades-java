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
public class Diretor extends CargoDeConfianca implements Contratacao {
    private final double PREMIO = 0.3;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadoCivil, LocalDate dataNascimento, String logradouro, String numero, String complemento, String cep, String cidade, UnidadeFederativa uf) {
        super(bonificacao, nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento, logradouro, numero, complemento, cep, cidade, uf);
    }

    
    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public double getSalarioFinal() {
        double SalarioFinal = 0;
        SalarioFinal += super.salario * super.bonificacao.getValor();
        SalarioFinal += super.salario * PREMIO;
        SalarioFinal += super.salario;
        
        return SalarioFinal;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("O funcionario foi admitido!");
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("//////////////////////////////");
        System.out.println("O funcionario foi DEMITIDO!!!!" + funcionario);
        System.out.println("//////////////////////////////");
    }

    @Override
    public String toString() {
        return "\n Diretor: " + 
               "\n Premio: " + PREMIO +
                super.toString();
    }
    
    
    
}
