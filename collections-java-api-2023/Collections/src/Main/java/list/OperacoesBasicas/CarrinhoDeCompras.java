package Main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<CarrinhoItem> carrinhoList;

    //Função para adicionar itens ao carrinho
    public void adicionarItem(String nome, Double preco, Integer quantidade) {

        if (carrinhoList == null) {
            carrinhoList = new ArrayList<>(); // Inicialize a lista apenas quando necessário
        }

        CarrinhoItem item = new CarrinhoItem();
        item.setNome(nome);
        item.setPreco(preco);
        item.setQuantidade(quantidade);
        carrinhoList.add(item);
    }

    //Função para exibir todos os itens de um carrinho
    public void exibirItens() {

        if (carrinhoList == null) {
            carrinhoList = new ArrayList<>(); // Inicialize a lista apenas quando necessário
        }

        if (carrinhoList.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            for (CarrinhoItem item : carrinhoList) {
                System.out.println(item);
            }
        }
    }

    //Função para remover itens por nome do carrinho.
    public void removerItemNome(String nome) {

        List<CarrinhoItem> itensParaRemover = new ArrayList<>();

        if (carrinhoList == null) {
            carrinhoList = new ArrayList<>(); // Inicialize a lista apenas quando necessário
        }

        if (carrinhoList.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            for (CarrinhoItem c : carrinhoList) {
                if (c.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(c);
                }
            }
        }

        carrinhoList.removeAll(itensParaRemover);

        if (itensParaRemover.isEmpty()) {
            System.out.println("Nenhum item correspondente foi encontrado.");
        } else {
            System.out.println("Itens removidos:");
            for (CarrinhoItem itemRemovido : itensParaRemover) {
                System.out.println("- " + itemRemovido.getNome());
            }
        }
    }

    //Função para calcular valor total de itens do carrinho.
    public double calcularValorTotal() {
        double valorTotal = 0.0;

        if (carrinhoList == null) {
            carrinhoList = new ArrayList<>(); // Inicialize a lista apenas quando necessário
        }

        if (carrinhoList.isEmpty()) {
            System.out.println("O carrinho está vazio.");
        } else {
            for (CarrinhoItem item : carrinhoList) {
                double precoItem = item.getPreco();
                int quantidadeItem = item.getQuantidade();
                valorTotal += precoItem * quantidadeItem;
            }
        }
        return valorTotal;
    }


    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Chame o método adicionarItem passando os valores do item
        carrinho.adicionarItem("Item 1", 10.0, 2);
        carrinho.adicionarItem("Item 2", 20.0, 3);
        carrinho.adicionarItem("Item 3", 30.0, 5);


        // Chame o método exibirItens para exibir os itens do carrinho
        System.out.println("******** LISTA DE ITENS DO CARRINHO ********");
        carrinho.exibirItens();
        System.out.println();

        //Chame o método removerItemNome passando o nome do item a ser removido
        System.out.println("******** LISTA DE ITENS REMOVIDOS ********");
        carrinho.removerItemNome("Item 1");
        System.out.println();

        // Chame o método exibirItens para exibir os itens do carrinho
        System.out.println("******** LISTA DE ITENS DO CARRINHO ********");
        carrinho.exibirItens();
        System.out.println();

        System.out.println("******** VALOR TOTAL DO CARRINHO ********");
        //Chame o metodo calcularValorTotal para calcular o valor total do carrinho
        //Criei uma variavel double pois a mesma ira armazenar o retorno da função calcularValorTotal.
        double valorTotal = carrinho.calcularValorTotal();
        System.out.println("Valor total do carrinho: " + valorTotal);
    }

}
