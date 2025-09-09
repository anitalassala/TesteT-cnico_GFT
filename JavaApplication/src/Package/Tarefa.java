package Package;

public class Tarefa {
    
    private String Task;
    private String Descrição;
            
    public String getTask() {
        return Task;
    }

    public void setTask(String Task) {
        this.Task = Task;
    }
    
    public String getDescrição() {
        return Descrição;
    }

    public void setDescrição(String Descrição) {
        this.Descrição = Descrição;
    }
    
    
    
    public void ExibirConcluida () {
        System.out.println("Terefa: " + Task);
        System.out.println("[X] " + Descrição);
        
    }
    
    public void ExibirNãoConcluida () {
        System.out.println("Terefa: " + Task);
        System.out.println("[ ] " + Descrição);
        
    }
    
}
