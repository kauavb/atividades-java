package func;

import java.time.LocalDate;

public class Funcionario {
    private int id;
    private String nome;
    private double salario;
    private int idade;
    private Genero genero;
    private Setor setor;
    private LocalDate DataNascimento;

    public Funcionario(int id, String nome, double salario, int idade, Genero genero, Setor setor, LocalDate DataNascimento) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;
        this.genero = genero;
        this.setor = setor;
        this.DataNascimento = DataNascimento;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public LocalDate getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(LocalDate DataNascimento) {
        this.DataNascimento = DataNascimento;
    }
    
    
}
