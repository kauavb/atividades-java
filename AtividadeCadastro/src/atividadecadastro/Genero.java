
package atividadecadastro;


public enum Genero {
    // construindo atributos e variaveis
    MASCULINO("Masculino", 'M'),
    FEMININO("Feminino", 'F');
    
    // atributos
    private final String texto;
    private final char sigla;
    
    //construtor

    private Genero(String texto, char sigla) {
        this.texto = texto;
        this.sigla = sigla;
    }
    
    //getter

    public String getTexto() {
        return texto;
    }

    public char getSigla() {
        return sigla;
    }
    
    
}
