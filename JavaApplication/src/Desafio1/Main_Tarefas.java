//Situa��o: Um estagi�rio precisa organizar suas tarefas do dia.
//Objetivo:
//Crie uma classe Tarefa com atributos descritivos e conclu�dos.
//Criar m�todos para marcar como conclu�do e para exibir a tarefa no formato: 
//[ ] Descri��o (se n�o conclu�da) [X] Descri��o (se conclu�da).
//No programa principal, crie pelo menos 2 tarefas e altere o status de uma delas.

package Desafio1;

public class Main_Tarefas {

    public static void main(String[] args) {
        Tarefa a = new Tarefa();
        Tarefa b = new Tarefa();
        
        a.setTask("Emails");
        b.setTask("Enviar Projeto");
        
        a.setDescri��o("Verifcar a caixa de entrada de emails");
        b.setDescri��o("Enviar o projeto para a analise");
              
        a.ExibirConcluida();
        b.ExibirN�oConcluida();
    }
    
}
