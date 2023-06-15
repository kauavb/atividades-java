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
public class Main {
    public static void main(String[] args) {
        
    
    Cachorro cachorro = new Cachorro();
    Gato gato = new Gato();
    Pato pato = new Pato();
    Galo galo = new Galo();
    
   System.out.println("Cachorro: "+ cachorro.emitirSom());
   System.out.println("Comida: "+ cachorro.comer());
        System.out.println("");
   System.out.println("Gato: "+ gato.emitirSom());
   System.out.println("Comida: "+ gato.comer());
        System.out.println("");
   System.out.println("Pato: "+ pato.emitirSom());
   System.out.println("Comida: "+ pato.comer());
        System.out.println("");
   System.out.println("Galo: "+ galo.emitirSom());
   System.out.println("Comida: "+ galo.comer());



   
    }
}
