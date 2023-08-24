package desafios;

import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");
        int  nmr = entrada.nextInt();

        int ant = nmr - 1;
        int suc = nmr + 1;

        System.out.printf("O antecessor ao número digitado é: %d \n", ant);
        System.out.printf("O sucessor ao número digitado é: %d", suc);

    }
}
