package desafios;

import java.util.Scanner;

public class Desafio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira a peça:");
        String  peça = entrada.nextLine();

        System.out.print("Insira a segunda peça:");
        String  peça2 = entrada.nextLine();

        System.out.printf("Insira o código da %s:", peça);
        double  cod = entrada.nextDouble();

        System.out.printf("Insira o valor da %s:", peça);
        double  valor = entrada.nextDouble();

        System.out.printf("Insira a quantidade de %ss:", peça);
        double  quant = entrada.nextDouble();

        // peça 2

        System.out.printf("Insira o código da %s:", peça2);
        double  cod2 = entrada.nextDouble();

        System.out.printf("Insira o valor da %s:", peça2);
        double  valor2 = entrada.nextDouble();

        System.out.printf("Insira a quantidade de %ss:", peça2);
        double  quant2 = entrada.nextDouble();

        double ipi = (valor * quant + valor2 * quant2) * 15 / 100;
        double total =  (valor * quant + valor2 * quant2) + ipi;

        System.out.printf("o valor da sua compra é: R$%.2f", total);

        entrada.close();



    }
}
