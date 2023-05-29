/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv2905;

import java.time.LocalDate;
import java.time.Period;


public class Fisica extends Pessoa {
    //variaveis da classe Fisica

    private String cpf;
    private String rg;
    private LocalDate dataNascimento;

   //method construtor

    public Fisica(String cpf, String rg, LocalDate dataNascimento, String nome, String telefone) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
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
    
    @Override // pode mudar
    public String toString() {
        return super.toString() +
                "\n CPF:" + cpf + 
                "\n RG:" + rg + 
                "\n Data de Nascimento: " + dataNascimento +
                "\n Idade: " + getIdade();
    }

    
    
  
    
    
}
