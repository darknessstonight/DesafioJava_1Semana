package desafios;

import java.util.Scanner;

public class Desafio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira a peça:");
        String  peça = entrada.nextLine();

        System.out.println("Insira o código da peça:");
        double  cod = entrada.nextDouble();

        System.out.println("Insira o valor da peça:");
        double  valor = entrada.nextDouble();

        System.out.println("Insira a quantidade de peças:");
        double  quant = entrada.nextDouble();

        // se houver uma segunda peça


        System.out.println("Insira a segunda peça:");
        String  peça2 = entrada.nextLine();

        System.out.println("Insira o código da segunda peça:");
        double  cod2 = entrada.nextDouble();

        System.out.println("Insira o valor da segunda peça:");
        double  valor2 = entrada.nextDouble();
        
        final double ipi = valor * 15/100 ;
        double valorf = valor + ipi;
        double valorf2 = valor2 + ipi;

        System.out.println();




        entrada.close();



    }
}
