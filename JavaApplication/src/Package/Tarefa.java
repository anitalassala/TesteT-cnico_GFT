package Package;

public class Tarefa {
    
    private String Task;
    private String Descri��o;
            
    public String getTask() {
        return Task;
    }

    public void setTask(String Task) {
        this.Task = Task;
    }
    
    public String getDescri��o() {
        return Descri��o;
    }

    public void setDescri��o(String Descri��o) {
        this.Descri��o = Descri��o;
    }
    
    
    
    public void ExibirConcluida () {
        System.out.println("Terefa: " + Task);
        System.out.println("[X] " + Descri��o);
        
    }
    
    public void ExibirN�oConcluida () {
        System.out.println("Terefa: " + Task);
        System.out.println("[ ] " + Descri��o);
        
    }
    
}
