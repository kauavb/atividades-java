
package estado;

import java.time.LocalDate;
import java.time.Month;


public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua da Areia", "76", "Casa", "40710.060", "Salvador", UnidadeFederativa.BAHIA);
        Pessoa pessoa = new Pessoa(1, "Kauã", LocalDate.of(2003, Month.OCTOBER, 13), 9140.3987, "kauag80@hotmail.com", Genero.MASCULINO, endereco);
        
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("As informações do Usuario são: ");
        System.out.println("");
        System.out.println("ID: " +pessoa.getId());
        System.out.println("Nome: " +pessoa.getNome());
        System.out.println("Data de Nascimento: " +pessoa.getDataNascimento());
        System.out.println("Telefone: " +pessoa.getTelefone());
        System.out.println("Email: " +pessoa.getEmail());
        System.out.println("Gênero: " +pessoa.getGenero().getTexto());
        System.out.println("");
        System.out.println("As informações do Endereço são: ");
        System.out.println("");
        System.out.println("Logradouro: " +pessoa.getEndereco().getLogradouro());
        System.out.println("Número: " +pessoa.getEndereco().getNumero());
        System.out.println("Complemento: " +pessoa.getEndereco().getComplemento());
        System.out.println("CEP: " +pessoa.getEndereco().getCep());
        System.out.println("Cidade: " +pessoa.getEndereco().getCidade());
        System.out.println("Unidade Federativa: " +pessoa.getEndereco().getUnidadeFederativa().getNome());
    }
}
