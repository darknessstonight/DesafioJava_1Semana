package desafios;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Idade em anos:");
        int  ano = entrada.nextInt();

        System.out.printf(" %d e quantos meses?\n", ano);
        int  meses = entrada.nextInt();

        System.out.printf(" %d anos %d meses e quantos dias?\n", ano , meses);
        int  dias = entrada.nextInt();

        System.out.println( "Você possui " + ((ano*365) + (meses*30)+ dias) + " dias de vida"  );

        entrada.close();
    }

}
