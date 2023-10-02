/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ingresso;

/**
 *
 * @author Aluno
 */
public abstract class Ingresso {
    protected float valor;
    private String nome;
    private String cpf;

    public Ingresso(float valorIngresso, String nomeCliente, String numCPF) {
        valor = valorIngresso;
        nome = nomeCliente;
        cpf = numCPF;
    }

    public boolean ValidarIngresso(float valor,String nome,String cpf){
        if (valor < 0)
            return false;
        else{
            return true;
        }
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    

    @Override
    public String toString() {
        return "\n Ingresso: " + 
                "\n Valor: " + valor + 
                "\n Nome: " + nome + 
                "\n CPF: " + cpf;
    }
    
    
}
