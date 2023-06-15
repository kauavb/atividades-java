/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statics;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {

   
    public static void main(String[] args) {
       Pessoa pessoa = new Pessoa("Rafaela", LocalDate.of(2003, Month.AUGUST, 13), 5000);
        
               
        System.out.println(pessoa.toString());      
    }
    
}
