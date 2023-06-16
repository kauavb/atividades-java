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
public class Motoboy extends Funcionario{
    private String placaDaMoto;

    // construtor
    public Motoboy(String placaDaMoto, String nome, String cpf, String rg, Genero genero, double salario, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, salario, dataNascimento, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }

    // metodo get salario
    @Override
    public double getSalarioFinal() {
        return salario;
    }

    // getter e setter
    
    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }
    
    // to string

    @Override
    public String toString() {
        return "\n Motoboy: " + 
               "\n Placa Da Moto: " + placaDaMoto +
                super.toString();
    }
    
    
    
    
}
