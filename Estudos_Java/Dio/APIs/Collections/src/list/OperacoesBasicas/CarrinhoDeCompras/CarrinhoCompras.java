package list.OperacoesBasicas.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    //atributo
    private List<Item> ItemList;

    public CarrinhoCompras(){
        this.ItemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, int preco, int quantidade){
        ItemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        for(Item t : ItemList){
            if(t.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(t);
            }
        }
        ItemList.removeAll(itemParaRemover);
    }

    public int calcularValorTotal(){
        int valorTotal = 0;
        for (Item item : ItemList) {
            double valorItem = item.getPreco() * item.getQuantidade();
            valorTotal += valorItem; 
          }
          return valorTotal;
    }

    public void exibirItens(){
        System.out.println(this.ItemList);
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        carrinhoCompras.adicionarItem("Geladeira", 2000, 1);
        carrinhoCompras.adicionarItem("Celular", 800, 2);
        carrinhoCompras.adicionarItem("Computador", 1200, 1);

        carrinhoCompras.exibirItens();

        carrinhoCompras.removerItem("Geladeira");

        carrinhoCompras.exibirItens();

        System.out.println("Valor total: " + carrinhoCompras.calcularValorTotal());
    }
}
