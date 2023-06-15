/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author Aluno
 */
public class Cachorro implements Animal{

    @Override
    public String emitirSom() {
        return "Au-au";
    }

    @Override
    public String comer() {
        return "Osso";
    }
    
}
