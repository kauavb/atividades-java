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
public class Xadrez implements Jogo {

    @Override
    public void jogar() {
        System.out.println("Faça sua proxima jogada");
    }

    @Override
    public void fechar() {
        System.out.println("1 Rodada restante. Jogue para finalizar a partida.");
    }
    
}
