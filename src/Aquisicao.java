import java.util.Date;

public class Aquisicao {

    private Fornecedor fornecedor;
    private Livro livro;
    private double preco;
    private Date data_hora;

    public Aquisicao(
            Fornecedor fornecedor, Livro livro, double preco, Date data_hora
                    ) {
        this.fornecedor = fornecedor;
        this.livro = livro;
        this.preco = preco;
        this.data_hora = data_hora;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Date getData_hora() {
        return data_hora;
    }

    public void setData_hora(Date data_hora) {
        this.data_hora = data_hora;
    }
}
