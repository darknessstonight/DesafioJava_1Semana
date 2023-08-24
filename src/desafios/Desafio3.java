package desafios;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um valor:");
        double valor = entrada.nextDouble();

        double resultado = (valor/ 100) + valor;
        double resultado2 = valor -(valor/ 100);


        System.out.printf("Valor com acréscimo R$%.2f \n", resultado );
        System.out.printf("Valor com desconto R$%.2f", resultado2 );

        entrada.close();
    }
}
