package Desafio2;

public class MediaTemperaturas {

    private String calculo;
    private double dia1;
    private double dia2;
    private double dia3;
    private double dia4;
    private double dia5;
    private double dia6;
    private double dia7;

    public void Calculo() {
        System.out.println("Média das temperaturas");
        System.out.printf("%.2f°%n", (dia1 + dia2 + dia3 + dia4 + dia5 + dia6 + dia7) / 7.0);
    }

    public void MaioreMenor() {

        double maior = dia1;
        double menor = dia1;

        if (dia2 > maior) {
            maior = dia2;
        }
        if (dia3 > maior) {
            maior = dia3;
        }
        if (dia4 > maior) {
            maior = dia4;
        }
        if (dia5 > maior) {
            maior = dia5;
        }
        if (dia6 > maior) {
            maior = dia6;
        }
        if (dia7 > maior) {
            maior = dia7;
        }

        if (dia2 < menor) {
            menor = dia2;
        }
        if (dia3 < menor) {
            menor = dia3;
        }
        if (dia4 < menor) {
            menor = dia4;
        }
        if (dia5 < menor) {
            menor = dia5;
        }
        if (dia6 < menor) {
            menor = dia6;
        }
        if (dia7 < menor) {
            menor = dia7;
        }

        System.out.printf("A maior temperatura foi: %.2f°%n", maior);
        System.out.printf("A menor temperatura foi: %.2f°%n", menor);
    }

    public double getDia1() {
        return dia1;
    }

    public void setDia1(double dia1) {
        this.dia1 = dia1;
    }

    public double getDia2() {
        return dia2;
    }

    public void setDia2(double dia2) {
        this.dia2 = dia2;
    }

    public double getDia3() {
        return dia3;
    }

    public void setDia3(double dia3) {
        this.dia3 = dia3;
    }

    public double getDia4() {
        return dia4;
    }

    public void setDia4(double dia4) {
        this.dia4 = dia4;
    }

    public double getDia5() {
        return dia5;
    }

    public void setDia5(double dia5) {
        this.dia5 = dia5;
    }

    public double getDia6() {
        return dia6;
    }

    public void setDia6(double dia6) {
        this.dia6 = dia6;
    }

    public double getDia7() {
        return dia7;
    }

    public void setDia7(double dia7) {
        this.dia7 = dia7;
    }

}
