package func;

import java.time.LocalDate;


public enum Genero {
    MASCULINO("Masculino", 'M'),
    FEMININO("Feminino", 'F');
    
    
    private final String texto;
    private final char caracter;

    private Genero(String texto, char caracter) {
        this.texto = texto;
        this.caracter = caracter;
    }
    private LocalDate DataNascimento;

    private Genero(String texto, char caracter, LocalDate DataNascimento) {
        this.texto = texto;
        this.caracter = caracter;
        this.DataNascimento = DataNascimento;
    }

    public String getTexto() {
        return texto;
    }

    public char getCaracter() {
        return caracter;
    }

    public LocalDate getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(LocalDate DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

   
    

        
    
    
}
