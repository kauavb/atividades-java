/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv2905;
//extend = traz infromações de outra classe
public class Juridico extends Pessoa {
   //variaveis da classe juridica
   private String cnpj;
   private String inscricaoEstudual;

   //method construtor
    public Juridico(String cnpj, String inscricaoEstudual, String nome, String telefone) {
        super(nome, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstudual = inscricaoEstudual;
    }

    //method getter e setter
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstudual() {
        return inscricaoEstudual;
    }

    public void setInscricaoEstudual(String inscricaoEstudual) {
        this.inscricaoEstudual = inscricaoEstudual;
    }

    //method to string
    @Override // pode mudar
    public String toString() {
        return super.toString() +
                "\n CNPJ: " + cnpj + 
                "\n Inscrição Estadual: " + inscricaoEstudual;
    }
   
   
    
    
}
