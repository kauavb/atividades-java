/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package prova2;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        
        Engenheiro engenheiro = new Engenheiro("211.84", "Rafaela", "216.465.494-87", "20.464.264-87", new Endereco("Rua das Palmeiras", "65", "Chacara", "40154.54", "Salvador", UnidadeFederativa.BAHIA), Setor.ENGENHARIA, Genero.FEMININO, 5000, EstadoCivil.CASADO, LocalDate.of(2005, Month.AUGUST, 15), "", "", "", "", "", UnidadeFederativa.BAHIA);
        
        Gerente gerente1 = new Gerente(Bonificacao.GERENTE, "Gabriel", "254.454.164-87", "25.461.165-87", new Endereco("Hotel Plaza", "45", "Apartamento 564", "12947-36", "Sao Paulo", UnidadeFederativa.SAO_PAULO), Setor.RECURSOS_HUMANOS, Genero.MASCULINO, 10000, EstadoCivil.VIUVO, LocalDate.of(2000, Month.MAY, 30),"", "", "", "", "", UnidadeFederativa.SAO_PAULO);
        
        Diretor diretor1 = new Diretor(Bonificacao.DIRETOR, "Kaua", "095.461.164", "20.465.789-54", new Endereco("Horto Bela Scata", "12", "Proximo ao Mineri=ao", "545956-587", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO), Setor.RECURSOS_HUMANOS, Genero.MASCULINO, 15000, EstadoCivil.DIVORCIADO, LocalDate.of(1996, Month.DECEMBER, 26), "", "", "", "", "", UnidadeFederativa.RIO_DE_JANEIRO);
        
        Motoboy motoboy1 = new Motoboy("2167.4215", "Lucas", "973.421.427-21", "32.468.644-87", new Endereco("Corredor da Galinha", "789", "Aprtamento Rosa", "21164-727", "Feira de Santana", UnidadeFederativa.BAHIA), Setor.OPERACOES, Genero.MASCULINO, 1500, EstadoCivil.SOLTEIRO, LocalDate.of(1987, Month.JULY, 12), "", "", "", "", "", UnidadeFederativa.BAHIA);
        
        System.out.println(engenheiro.toString());
        System.out.println(gerente1);
        System.out.println(diretor1);
        System.out.println("");
        diretor1.demitir(motoboy1);
        
       
    }
}
