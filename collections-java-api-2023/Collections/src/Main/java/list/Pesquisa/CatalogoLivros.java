package Main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int inicio, int fim) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if (!livroList.isEmpty()){
            for (Livro l: livroList){
                if (l.getAnoPublicacao() >= inicio && l.getAnoPublicacao() <= fim){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;

        if (!livroList.isEmpty()){
            for (Livro l: livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        catalogoLivros.adicionarLivro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997);
        catalogoLivros.adicionarLivro("O Hobbit", "J.R.R. Tolkien", 1937);

        //pesquisar por autor
        System.out.println(catalogoLivros.pesquisarPorAutor("J.R.R. Tolkien"));

        //pesquisar por intervalo de anos
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1990, 2000));

        //pesquisar por titulo
        System.out.println(catalogoLivros.pesquisarPorTitulo("O Senhor dos Anéis"));
    }

}
