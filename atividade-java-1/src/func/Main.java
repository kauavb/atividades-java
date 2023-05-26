package func;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(15, "Kauã", 2000.50, 32, Genero.MASCULINO, Setor.RECURSOS_HUMANOS, LocalDate.of(2003, Month.OCTOBER, 13));
        
        System.out.println("As informações do Funcionário são: ");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("");
        System.out.println("ID: " +funcionario.getId());
        System.out.println("Nome: " +funcionario.getNome());
        System.out.println("Data de Nascimento: " +funcionario.getDataNascimento());
        System.out.println("Salário: " +funcionario.getSalario());
        System.out.println("Setor: " +funcionario.getSetor().getTexto());
        System.out.println("Gênero: " +funcionario.getGenero().getTexto());
        System.out.println("Gênero com caracter: " +funcionario.getGenero().getCaracter());
        System.out.println("Idade: " +funcionario.getIdade());
    }
}
