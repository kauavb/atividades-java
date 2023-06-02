
package atividadecadastro;

import java.time.LocalDate;
import java.time.Period;


public abstract class Fisica extends Pessoa {
    // atributos
    protected Genero genero;
    protected EstadoCivil estadoCivil;
    protected LocalDate dataNascimento;

    // construtor

    public Fisica(Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(id, nome, telefone, email, endereco);
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
    }
    
    // metodo get idade
    
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
    
    // getter e setter

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    // to string 

    @Override
    public String toString() {
        return 
                super.toString() +
               "\n Genero: " + genero.getTexto() +
               "\n Estado Civil: " + estadoCivil.getTexto() +
               "\n Data de Nascimento: " + dataNascimento +
               "\n Idade: " + getIdade();
    }
    
    
}
