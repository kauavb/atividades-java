/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogame;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
       VideoGame videogame = new VideoGame();
       
       videogame.ligar();
       videogame.jogar(new PingPong());
       videogame.desligar();
       videogame.fechar();
       
}
}
