
package atividadecadastro;

import java.time.LocalDate;
import java.time.Month;


public class Main {

    public static void main(String[] args) {
       
        Endereco endereco = new Endereco("Rua das Arvores", "75", "Apartamento Azul", "40125-89", "Salvador", UnidadeFederativa.SAO_PAULO);
        
        Medico medico1 = new Medico("12345,6", "096.664.535.92", "23.321.456-87", "155", Setor.SAUDE, 15000, Genero.MASCULINO, EstadoCivil.SOLTEIRO, LocalDate.of(2003, Month.OCTOBER, 13), 034, "Kauã", "(71) 99140-3987", "kauag80@hotmail.com", endereco);
        
        
        System.out.println(medico1.toString());
    }
    
}
