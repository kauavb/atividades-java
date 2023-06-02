
package atividadecadastro;


public enum EstadoCivil {
    //construindo atributos e variaveis 
    SOLTEIRO("Solteiro"),
    CASADO("Casado"),
    SEPARADO("Separado"),
    DIVORCIADO("Divorciado"),
    VIUVO("Viúvo");
    
    //atributo
    protected String texto;
    
    //construtor

    private EstadoCivil(String texto) {
        this.texto = texto;
    }

    // getter e setter
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
    
}
