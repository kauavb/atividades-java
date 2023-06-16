
package autenticavel;

import java.time.LocalDate;
import java.time.Month;


public class Main {

   
    public static void main(String[] args) {
       Motoboy motoboy = new Motoboy("ABC_879", "Leticia", "987.546.459-98", "20.845.455-45", Genero.FEMININO, 3500, LocalDate.of(2001, Month.FEBRUARY, 22), LocalDate.of(2015, Month.MARCH, 05));
      
       Gerente gerente = new Gerente(Bonificacao.GERENTE, "Gabriela", "978.215.545-39", "06.464.458-89", Genero.FEMININO, 7000, LocalDate.of(1990, Month.DECEMBER, 15), LocalDate.of(2001, Month.NOVEMBER, 17));
       
       Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Marcos", "548.871.316-03", "13.654.655-89", Genero.MASCULINO, 10000, LocalDate.of(1999, Month.MAY, 12), LocalDate.of(2019, Month.JULY, 13));
//       if (motoboy instanceof Autenticavel){
//           System.out.println("Acesso Permitido");
//       } else {
//           System.out.println("Acesso Negado");
//       }



        System.out.println(motoboy.toString());
        System.out.println(gerente);
        System.out.println(diretor);
    }
    
}
