/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demitir;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Motoboy extends Funcionario {
    private String carteiraDeHabilitacao;

    public Motoboy(String carteiraDeHabilitacao, String nome, LocalDate dataNascimento, Genero genero, Setor setor, double salarioBase) {
        super(nome, dataNascimento, genero, setor, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }   

    //getter e setter

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }
    
   // get salario final
    @Override
    public double getSalarioFinal() {
        return salarioBase;
    }
    
    // to string

    @Override
    public String toString() {
        return "\n Motoboy: " + 
                super.toString() +
                "\n Carteira De Habilitacao:" + carteiraDeHabilitacao;
    }
    
    
}
