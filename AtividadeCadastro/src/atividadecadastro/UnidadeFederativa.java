
package atividadecadastro;


public enum UnidadeFederativa {
    // construindo atributos e variaveis
    BAHIA("Bahia", "BH"),
    SAO_PAULO("São Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ");
    
    //atributos
    protected String nome;
    protected String sigla;

    //construtor
    
     private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }
   
    //getter e setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
     
     

   

    
    
    
}
