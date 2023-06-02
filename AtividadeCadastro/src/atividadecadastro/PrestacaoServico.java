
package atividadecadastro;

import java.time.LocalDate;


public class PrestacaoServico extends Juridica {
    //atributos
    private LocalDate contratoInicio;
    private LocalDate contratoFim;
    
    // construtor

    public PrestacaoServico(LocalDate contratoInicio, LocalDate contratoFim, String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, id, nome, telefone, email, endereco);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }
    
    // getter e setter

    public LocalDate getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(LocalDate contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    public LocalDate getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(LocalDate contratoFim) {
        this.contratoFim = contratoFim;
    }

   // to string

    @Override
    public String toString() {
        return "\n Prestacao Servico: " + 
               "\n Contrato Inicio: " + contratoInicio +
               "\n Contrato Fim: " + contratoFim;
    }

   

    
    }

    

