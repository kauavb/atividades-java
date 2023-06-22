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
public class Diretor extends Funcionario implements Contratacao {
    private final double premio = 0.2;

    public Diretor(String nome, LocalDate dataNascimento, Genero genero, Setor setor, double salarioBase) {
        super(nome, dataNascimento, genero, setor, salarioBase);
    }

    @Override
    public double getSalarioFinal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void admitir(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void demitir(Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
