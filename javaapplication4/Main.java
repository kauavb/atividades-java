/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

import java.time.LocalDate;
import java.time.Month;


public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua da Areia", "76", "Casa", "40717-060", "Salvador", UnidadeFederativa.BAHIA);
        
        //Criação de objeto pessoa fisica
        Fisica fisica1 = new Fisica("096.664.535.92", "214.5645.89", LocalDate.of(2000, Month.OCTOBER, 19  ), 20, Genero.MASCULINO, 15, "Kauã", "(71) 99140-3987", endereco);
 
        //Criação de objeto pessoa juridica
        Juridico juridico1 = new Juridico("61.215.524/0001-07", "121345.6", LocalDate.of(2003, Month.JANUARY, 20), LocalDate.of(1950, Month.DECEMBER, 19), 500645.895, 36, "Marcos Entretenimento", "(00) 12345-6789", new Endereco("Pituba", "250", "Apartamento", "67584-98", "Coração de Maria", UnidadeFederativa.BAHIA));
       
        //resultado
        System.out.println("Pessoa Física ////////////////");
        System.out.println(fisica1.toString());
        System.out.println("");
        System.out.println("Pessoa Juridica //////////////");
        System.out.println(juridico1.toString());
             
    }
}
