
package atividadecadastro;


public class Fornecedor extends Juridica {
    // atributos
    private String produto;
    
    //construtor
    
     public Fornecedor(String produto, String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, id, nome, telefone, email, endereco);
        this.produto = produto;
    }
    // getter e setter   

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    // to string

    @Override
    public String toString() {
        return "\n Fornecedor: " + 
               "\n Produto: " + produto;
    }

    
}
