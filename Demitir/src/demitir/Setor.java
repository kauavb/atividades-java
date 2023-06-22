
package demitir;


public enum Setor {
    RECURSOS_HUMANOS("Recursos Humanos"),
    FINANCEIRO("Financeiro"),
    OPERACOES("Operacoes");
    
    protected String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
}
