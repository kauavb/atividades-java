/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

public abstract class Pessoa {
    //variaveis da classe
    protected int id;
    protected String nome;
    protected String telefone;
    protected Endereco endereco;

    //method construtor

    public Pessoa(int id, String nome, String telefone, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    //method getter
    
    public int getId() {
        return id;
    }

    public String getNome() {  
        return nome;
    }

    public String getTelefone() {   
        return telefone;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    //method setter
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    

    @Override
    public String toString() {
        return "\n id: " + id + 
                "\n nome: " + nome + 
                "\n telefone: " + telefone + 
                "\n endereco: " + endereco;
    }

    
    
    
}
