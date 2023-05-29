/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv2905;

import java.time.LocalDate;
import java.time.Month;


public class Main {
    public static void main(String[] args) {
        //Criação de objeto pessoa fisica
        Fisica pessoaFisica = new Fisica("123.456.789-00", "123456789", LocalDate.of(2003, Month.OCTOBER, 13), "Kauã", "(71) 99140-3987");
        //Criação de objeto pessoa juridica
        Juridico pessoaJuridico = new Juridico("987.654.321-00", "12.3456789", "SENAI - CIMATEC", "(71) 3333-8888");
        
        //resultado
        System.out.println(pessoaFisica.toString());
        System.out.println("");
        System.out.println(pessoaJuridico);
             
    }
}
