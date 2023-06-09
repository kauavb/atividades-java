/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Cliente extends Fisica {
    private int protocoloAtendimento;
            
    // construtor

    public Cliente(int protocoloAtendimento, LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(dataNascimento, genero, nome, telefone, email, endereco);
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
        return "\n Informacoes do Cliente: " +
                "\n " +
               "\n Protocolo de Atendimento: " + protocoloAtendimento +
                super.toString();
    }
    
    
}
