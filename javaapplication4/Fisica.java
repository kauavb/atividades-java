/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import java.time.LocalDate;
import java.time.Period;


public class Fisica extends Pessoa {
    //variaveis da classe Fisica

    private String cpf;
    private String rg;
    private LocalDate dataNascimento;
    private double salario;
    private Genero genero;
    
   //method construtor

    public Fisica(String cpf, String rg, LocalDate dataNascimento, double salario, Genero genero, int id, String nome, String telefone, Endereco endereco) {
        super(id, nome, telefone, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
        this.genero = genero;
    }

    //method getIdade
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    //method getter
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    //method getter
    public void setRg(String rg) {
        this.rg = rg;
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

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n CPF: " + cpf + 
                "\n RG: " + rg + 
                "\n Data de Nascimento: " + dataNascimento + 
                "\n Salario: " + salario + 
                "\n Genero: " + genero +
                "\n Idade: " + getIdade();
    }
    
    
    
   

    
    
  
    
    
}
