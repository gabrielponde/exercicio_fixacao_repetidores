package exercicio_while.exercicio_while_1;

import java.util.Scanner;

public class leitura_senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        while (x != 2002) {

            x = sc.nextInt();
            System.out.println("Senha Invalida");

        }
        System.out.println("Acesso permitido");

        sc.close();
    }
}
