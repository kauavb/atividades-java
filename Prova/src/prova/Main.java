/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Motoboy motoboy1 = new Motoboy("564.546", "548.584.899", "20.564.256", "987", Setor.OPERACOES, 1300, LocalDate.of(2003, Month.OCTOBER, 23), Genero.FEMININO, "Rafaela", "(11) 98724-2640", "rafalinda@gmail.com", 
                new Endereco("Rua das Palmeiras", "561", "Apartamento Lagoa Azul", "24545-546", "Salvador", UnidadeFederativa.BAHIA));
        
        Medico medico1 = new Medico("5215-1", "213.854.967", "12.546.456", "549", Setor.SAUDE, 17000, LocalDate.of(1996, Month.JANUARY, 4), Genero.FEMININO, "Leticia", "(64) 12743-6274", "leticiagomes@bobo.com", 
                new Endereco("Vale das Aguas", "03", "Chacara dos Golfinhos", "45878-55", "Guarulhos", UnidadeFederativa.SAO_PAULO));
        
        Advogado advogado1 = new Advogado("2546-1", "789.456.123", "55.478.9631", "36", Setor.JURIDICO, 9000, LocalDate.of(2001, Month.NOVEMBER, 13), Genero.FEMININO, "Luana", "(71) 06996-7223", "luanakat@gmail.com", 
                new Endereco("Caminho do Fogo", "96", "Restaurante Leblon", "12364-54", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO));
        
        
        System.out.println(motoboy1.toString());
        System.out.println("");
        System.out.println(medico1.toString());
        System.out.println("");
        System.out.println(advogado1.toString());
        
        Juridica juridica1 = new Juridica("4569-456.21", "6644.54", "Luiza Fashion", "(21) 3364-4727", "luizafashion@gmail.com", 
                new Endereco("Copacabana Palace", "001", "Proximo ao Calcadao", "11244-56", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO));
        
        System.out.println("");
        System.out.println(juridica1);
        
        Cliente cliente1 = new Cliente(00215, LocalDate.of(2007, Month.FEBRUARY, 6), Genero.FEMININO, "Marcela", "(99) 26326-2638", "marcelinha@gmail.com", 
                new Endereco("Itaigara", "54", "Proximo ao Shopping Itaigara", "1245-455", "Salvador", UnidadeFederativa.BAHIA));
        
        System.out.println("");
        System.out.println(cliente1);
        
        
        
        
        
    
    
}
}
