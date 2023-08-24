package desafios;

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Valor do seu salário:");
        double  salario = entrada.nextDouble();

        double resultado = salario/ 788.00;

        System.out.printf("A quantidade de salários mínimos que você ganha são %.1f", resultado);

        entrada.close();
    }
}
