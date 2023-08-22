package Main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String,Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContatos(String nome, int telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContatos(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisaPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContatos("João", 123);
        agendaContatos.adicionarContatos("Maria", 456);
        agendaContatos.adicionarContatos("Maria", 789);
        agendaContatos.exibirContatos();

        agendaContatos.removerContatos("Maria");
        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisaPorNome("João"));

    }
}
