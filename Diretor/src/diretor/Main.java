
package diretor;

import java.time.LocalDate;
import java.time.Month;


public class Main {
    public static void main(String[] args) {
        
        Motoboy motoboy1 = new Motoboy("ABC-123", "Saori", "528.963.147-00", "201.2546.78", Genero.MASCULINO, Setor.OPERACOES, 1200, LocalDate.of(2000, Month.AUGUST, 15));
        
        Gerente gerente1 = new Gerente(Bonificacao.GERENTE, "Pedro", "544.545.152-00", "45;545;455.45", Genero.MASCULINO, Setor.ADMINISTRATIVO, 10000, LocalDate.of(2003, Month.DECEMBER, 14));
        
        Diretor diretor1 = new Diretor(Bonificacao.DIRETOR, "Luli", "654.987.123-20", "20.545.5587-00", Genero.MASCULINO, Setor.ADMINISTRATIVO, 15000, LocalDate.of(2018, Month.NOVEMBER, 07));
        
        System.out.println("/////////////////////////");
        System.out.println(motoboy1.toString());
        System.out.println("/////////////////////////");
        System.out.println(gerente1.toString());
        System.out.println("/////////////////////////");
        System.out.println(diretor1.toString());
        
    }
}
