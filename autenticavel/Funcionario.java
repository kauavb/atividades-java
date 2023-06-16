/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autenticavel;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public abstract class Funcionario implements SalarioFinal {
    protected String nome; 
    protected String cpf;
    protected String rg;
    protected Genero genero;
    protected double salario;
    protected LocalDate dataNascimento;
    protected LocalDate dataAdmissao;
    
    // construtor

    public Funcionario(String nome, String cpf, String rg, Genero genero, double salario, LocalDate dataNascimento, LocalDate dataAdmissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.genero = genero;
        this.salario = salario;
        this.dataNascimento = dataNascimento;
        this.dataAdmissao = dataAdmissao;
    }
    
    // getter

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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    // to string

    @Override
    public String toString() {
        return "\n Nome: " + nome + 
               "\n Cpf: " + cpf + 
               "\n Rg: " + rg + 
               "\n Genero: " + genero.getTexto() + 
               "\n Salario: " + Util.formatarMonetario(salario) +
               "\n Data de Nascimento: " + Util.formatarData(dataNascimento) + 
               "\n Data de Admissao: " + Util.formatarData(dataAdmissao);
    }
    
    
    

    
    
    
    
}
