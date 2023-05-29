/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv2905;

public abstract class Pessoa {
    //variaveis da classe
    protected String nome;
    protected String telefone;

    //method construtor

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    //method getter
    
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    //method setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //to string
    @Override // pode mudar
    public String toString() {
        return "\n Nome:" + nome +
                "\n Telefone:" + telefone;
    }
    
    
}
