package br.ulbra.MIniProjeto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Gerenciador {

    private ArrayList lista;

    public Gerenciador() {
        lista = new ArrayList();
    }

    public void adicionarTarefa(String tarefa) {
        if (tarefa.equals("") || tarefa.equals(null)) {
            JOptionPane.showMessageDialog(null, "informe a Tarefa antes ");
        } else {
            JOptionPane.showMessageDialog(null, "Tarefa adicionada! ");
            lista.add(tarefa);
        }
    }

    public int retornarTamanho() {
        return lista.size();
    }

    public String listarTarefas() {
        String tarefas = "";
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "nao existem tarefas");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                tarefas += (i + 1) + " - " + lista.get(i) + "\n";
            }
        }
        return tarefas;
    }

    public void alterar(int i, String tarefaNova) {
        lista.set(i, tarefaNova);
        JOptionPane.showMessageDialog(null, "Alterada com sucesso!");
    }

    public void excluirTarefa(int i) {
        if (i > lista.size() || i < 0) {
            JOptionPane.showMessageDialog(null, "Tarefa não existe");
        } else {
            lista.remove(i);
            JOptionPane.showMessageDialog(null, "Excluida com sucesso!");
        }
    }

    public void verificarListaVazia() {
        Boolean vazia = lista.isEmpty();
        if (vazia == true) {
            JOptionPane.showMessageDialog(null, "Lista está vazia ");
        } else {
            JOptionPane.showMessageDialog(null, "Tarefas na lista");
        }
    }

    public void quantidadeDeTarefas() {
        int quantidadeDeTarefas = lista.size();
        if (quantidadeDeTarefas == 0) {
            JOptionPane.showMessageDialog(null, "Lista está vazia");
        } else {
            JOptionPane.showMessageDialog(null, "A quantidade de tarefas na lista é " + quantidadeDeTarefas);
        }
    }

    public void colocarListaEmOrdemAlfabetica() {
        Collections.sort(lista);
    }

    public void excluirTodaLista() {
        lista.clear();
    }
}
