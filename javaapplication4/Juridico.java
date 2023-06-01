/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;
//extend = traz infromações de outra classe

import java.time.LocalDate;

public class Juridico extends Pessoa {
   //variaveis da classe juridica
   private String cnpj;
   private String inscricaoEstudual;
   private LocalDate dataInicio;
   private LocalDate dataTermino;
   private double valorContrato;
   //method construtor
   
    
    
    //method getter e setter

    public Juridico(String cnpj, String inscricaoEstudual, LocalDate dataInicio, LocalDate dataTermino, double valorContrato, int id, String nome, String telefone, Endereco endereco) {
        super(id, nome, telefone, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstudual = inscricaoEstudual;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.valorContrato = valorContrato;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getInscricaoEstudual() {
        return inscricaoEstudual;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public double getValorContrato() {
        return valorContrato;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setInscricaoEstudual(String inscricaoEstudual) {
        this.inscricaoEstudual = inscricaoEstudual;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public void setValorContrato(double valorContrato) {
        this.valorContrato = valorContrato;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n CNPJ: " + cnpj + 
                "\n Inscricao Estudual: " + inscricaoEstudual +
                "\n Data de Inicio: " + dataInicio + 
                "\n Data de Termino: " + dataTermino + 
                "\n Valor do Contrato: " + valorContrato;
    }

   

    
    

   
    
    
}
