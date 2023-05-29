/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package profissao;

public class Main {
    public static void main(String[] args) {
        Medico inforMedico = new Medico("963.852.741", "Luana", "147.258.369-00", "333.333.33.2", 15.000);
        
        Motoboy inforMotoboy = new Motoboy("258.455.7", "Mateus", "897.546.321-00", "333.222.11.4", 1320.10);
        
        Engenheiro inforEngenheiro = new Engenheiro("741.546.55", "Pablo", "852.741.369-11", "654.312.789", 7216.00);
        
        System.out.println("As informações do Médico são: ");
        System.out.println(inforMedico.toString());
        System.out.println("");
        System.out.println("As informações do Motoboy são: ");
        System.out.println(inforMotoboy.toString());
        System.out.println("");
        System.out.println("As informações do Engenheiro são: ");
        System.out.println(inforEngenheiro);
    }
}
