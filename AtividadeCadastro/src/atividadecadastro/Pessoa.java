/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadecadastro;

/**
 *
 * @author Aluno
 */
public abstract class Pessoa {
    //atributos
    private int id;
    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco;
    
    // construtor

    public Pessoa(int id, String nome, String telefone, String email, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
    
    // getter e setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    // to string

    @Override
    public String toString() {
        return  
               "\n ID: " + id + 
               "\n Nome: " + nome + 
               "\n Telefone: " + telefone + 
               "\n Email: " + email + 
               "\n Endereco: " + endereco;
    }
    
    
    
    
    
    
}
