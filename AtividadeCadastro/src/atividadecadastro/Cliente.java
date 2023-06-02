/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadecadastro;

import java.time.LocalDate;


public class Cliente extends Fisica {
    // atributo
    private int protocoloAtendimento;
    
    // construtor
    
     public Cliente(int protocoloAtendimento, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(genero, estadoCivil, dataNascimento, id, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }
    
   
    // getter e setter
    
    public int getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(int protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

   // to string

    @Override
    public String toString() {
        return "\n Cliente: " + 
               "\n Protocolo de Atendimento: " + protocoloAtendimento;
    }
    
    
    
}
