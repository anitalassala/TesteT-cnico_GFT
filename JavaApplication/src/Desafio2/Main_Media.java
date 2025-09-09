//Situação: O estagiário está acompanhando a temperatura da cidade durante a semana.
//Objetivo:
//Ler as temperaturas de 7 dias.
//Calcular a média semanal.
//Exibir a maior e a menor temperatura.
package Desafio2;

public class Main_Media {

    public static void main(String[] args) {
        MediaTemperaturas a = new MediaTemperaturas();

        a.setDia1(25);
        a.setDia2(28);
        a.setDia3(24);
        a.setDia3(20);
        a.setDia4(19);
        a.setDia5(22);
        a.setDia6(23);
        a.setDia7(20);

        System.out.println("Temperaturas desta Semana");
        System.out.println("Segunda: " + a.getDia1());
        System.out.println("Terça: " + a.getDia2());
        System.out.println("Quarta: " + a.getDia3());
        System.out.println("Quinta: " + a.getDia4());
        System.out.println("Sexta: " + a.getDia5());
        System.out.println("Sábado: " + a.getDia6());
        System.out.println("Domingo: " + a.getDia7());
        System.out.println("---");
        a.Calculo();
        System.out.println("---");
        a.MaioreMenor();

    }

}
