package exercicio_for.exercicio_for_1;

import java.util.Scanner;

public class inteiro_e_impares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (x >= 1 && x <= 1000) {
            for (int i = 1; i <= x; i += 2) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
