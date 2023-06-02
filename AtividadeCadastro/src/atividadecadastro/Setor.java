
package atividadecadastro;


public enum Setor {
    // criando atributo e variaveis
    ENGENHARIA("Engenharia"),
    SAUDE("Saude"),
    JURIDICO("Juridico");
    
    // atributo
    protected String nome;
    
    // construtor
    
     private Setor(String nome) {
        this.nome = nome;
    }
    
    // getter e setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     
     

   
    
}
