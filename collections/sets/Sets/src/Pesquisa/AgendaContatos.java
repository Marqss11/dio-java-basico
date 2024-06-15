package Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributos
    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Bruno", 123);
        agendaContatos.adicionarContato("Bruno", 0);
        agendaContatos.adicionarContato("Bruno Marques", 11111);
        agendaContatos.adicionarContato("Bruno Santos", 44412);
        agendaContatos.adicionarContato("Douglinhas do Grau", 11111);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Bruno"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Douglinhas do Grau", 69531));
        
        agendaContatos.exibirContato();
    }
}
