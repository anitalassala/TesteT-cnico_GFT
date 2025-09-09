//Situação: Um estagiário precisa organizar suas tarefas do dia.
//Objetivo:
//Crie uma classe Tarefa com atributos descritivos e concluídos.
//Criar métodos para marcar como concluído e para exibir a tarefa no formato: 
//[ ] Descrição (se não concluída) [X] Descrição (se concluída).
//No programa principal, crie pelo menos 2 tarefas e altere o status de uma delas.

package Package;

public class Main_Tarefas {

    public static void main(String[] args) {
        Tarefa a = new Tarefa();
        Tarefa b = new Tarefa();
        
        a.setTask("Emails");
        b.setTask("Enviar Projeto");
        
        a.setDescrição("Verifcar a caixa de entrada de emails");
        b.setDescrição("Enviar o projeto para a analise");
              
        a.ExibirConcluida();
        b.ExibirNãoConcluida();
    }
    
}
