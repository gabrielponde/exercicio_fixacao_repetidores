package exercicio_while.exercicio_while_2;

import java.util.Scanner;

public class leitura_coordenadas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
        System.out.print("Digite as coordenadas X e Y (ou 0 para sair): ");
        int x = sc.nextInt();
        int y = sc.nextInt();

            if (x == 0 || y == 0) {
                break;
            }

            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }
        }

            sc.close();
    }
}
