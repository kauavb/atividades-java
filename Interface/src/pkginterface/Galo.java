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
public class Galo implements Animal {

    @Override
    public String emitirSom() {
       return "Cocorico";
    }

    @Override
    public String comer() {
        return "Milho";
    }
    
}
