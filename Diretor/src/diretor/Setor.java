
package diretor;


public enum Setor {
    ENGENHARIA("Engenharia"),
    SAUDE("Saude"),
    JURIDICO("Juridico"),
    FINANCEIRO("Financeiro"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    ADMINISTRATIVO("Administrativo"),
    OPERACOES("Operações");
    
    protected String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
}
