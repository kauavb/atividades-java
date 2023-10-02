/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ingresso;

/**
 *
 * @author Aluno
 */
public class IngressoVIP extends Ingresso {
    private float valorAdicional;

    public IngressoVIP(float valorIngresso, String nomeCliente, String numCPF, float valorAdicional) {
        super(valorIngresso, nomeCliente, numCPF);
        this.valorAdicional = valorAdicional;
    }
    
    public float getValorAdicional() {
        return valorAdicional;
    }
    
    @Override
    public float getValor( ) {
        return valor + valorAdicional;
    }

}
