
package diretor;

import java.time.LocalDate;

public class Motoboy extends Funcionario {
    private String placaDaMoto;

    //construtor
    public Motoboy(String placaDaMoto, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }

    //getter e setter
    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    // to string 
    @Override
    public String toString() {
        return  "\n Motoboy: " +
                super.toString() +
                "\n Placa Da Moto: " + placaDaMoto;
    }

    // get salario final 
    @Override
    public double getSalarioFinal() {
        return super.getSalarioBase();
    }

    
    
}
