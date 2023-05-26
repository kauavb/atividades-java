
package estado;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Pessoa {
    private int id;
    private String nome;
    private LocalDate DataNascimento;
    private double telefone;
    private String email;
    private Genero genero;
    private Endereco endereco;

    public Pessoa(int id, String nome, LocalDate DataNascimento, double telefone, String email, Genero genero, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.DataNascimento = DataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.genero = genero;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(LocalDate DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}
