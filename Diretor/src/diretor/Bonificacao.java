
package diretor;


public enum Bonificacao {
    GERENTE(0.2), // (20/100)
    DIRETOR(0.4); // (40/100)
    
    protected final double  valor;

    // construtor
    private Bonificacao(double valor) {
        this.valor = valor;
    }

   //metodo getter
    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Bonificacao{" + "valor" + valor + '}';
    }

    
    

    
    
    
}
