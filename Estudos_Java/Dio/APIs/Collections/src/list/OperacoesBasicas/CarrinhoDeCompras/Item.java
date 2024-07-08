package list.OperacoesBasicas.CarrinhoDeCompras;

public class Item {
    //atributos
    public String nome;
    public int preco;
    public int quantidade;

    public Item(String nome, int preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Itens [nome: " + nome + ", preco: " + preco + ", quantidade: " + quantidade + "]";
    }
}
