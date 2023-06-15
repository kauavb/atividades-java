/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statics;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Pessoa {
    private String name;
    private LocalDate dataNascimento;
    private double salario;
    
    // construtor
    
    public Pessoa(String name, LocalDate dataNascimento, double salario) {
        this.name = name;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }
    
    
    
    
    // getter e setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // to string

    @Override
    public String toString() {
        return "\n Nome: " + name + 
               "\n Data de Nascimento: " + Util.formatarData(dataNascimento) + 
               "\n Salario: " + Util.formatarMonetario(salario);
    }
    
    
}
