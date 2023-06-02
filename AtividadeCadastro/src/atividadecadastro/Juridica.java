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
public abstract class Juridica extends Pessoa {
    // atributos
    protected String cnpj;
    protected String inscricaoEstadual;

    // construtor

    public Juridica(String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereco endereco) {
        super(id, nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }
   

    // getter e setter

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    // to string

    @Override
    public String toString() {
        return "\n Juridica:" + 
               "\n CNPJ: " + cnpj +
               "\n Inscricao Estadual: " + inscricaoEstadual;
    }
    
    
    
}
