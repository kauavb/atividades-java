/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Medico extends Funcionario {
    private String crm;
    
    // construtor

    public Medico(String crm, String cpf, String rg, String matricula, Setor setor, double salario, LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, dataNascimento, genero, nome, telefone, email, endereco);
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
        return "\n Informacoes do Medico(a): " + 
                super.toString() +
                "\n CRM: " + crm;
    }
    
    
}
