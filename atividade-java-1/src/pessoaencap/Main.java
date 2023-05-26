/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoaencap;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Kauã", Genero.MASCULINO);
        
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Genero: " +pessoa.getGenero());
    }
    
}
