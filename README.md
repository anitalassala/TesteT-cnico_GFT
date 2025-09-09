# Teste Técnico - GFT
> Processo Seleivo estágio - Bootcamp GFT Start Java #7 na DIO

## Desafio 1 – Controle de Tarefas Simples
Situação:
Um estagiário precisa organizar suas tarefas do dia.

Objetivo:
- Criar uma classe Tarefa com atributos descricao e concluida.
- Criar métodos para marcar como concluída e para exibir a tarefa no formato:
  [ ] Descrição (se não concluída)
  [X] Descrição (se concluída).
- No programa principal, crie pelo menos 2 tarefas e altere o status de uma
delas.

## Desafio 2 – Cálculo de Média de Temperaturas
Situação:
O estagiário está acompanhando a temperatura da cidade durante a semana.

Objetivo:
- Ler as temperaturas de 7 dias.
- Calcular a média semanal.
- Exibir a maior e a menor temperatura.

## Desafio 3 – Como pedir ajuda para uma IA (LLM) com dados sensíveis
Situação:
Você está desenvolvendo um sistema para a empresa FinTechPlus Corp., que
processa dados de clientes.
No código abaixo (Java), há um trecho que armazenava o CPF diretamente em texto
plano no banco de dados:

```java
public class Cliente {
public static void main(String[] args) {
//TODO: lógica anterior
salvarCliente(“”, “607.523.430-68”);
}
public boolean salvarCliente(String nome, String cpf) {
// TODO: lógica para salvar no banco
return true;
}
}
```
Você deve criar um prompt one shot para pedir ajuda ao ChatGPT, solicitando boas
práticas de segurança para salvar esse dado.
**Sua tarefa não é escrever o código agora.**
Você deve criar o prompt que enviaria ao ChatGPT para pedir ajuda.
