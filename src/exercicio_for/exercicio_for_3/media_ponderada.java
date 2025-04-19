package exercicio_for.exercicio_for_3;

import java.util.Locale;
import java.util.Scanner;

public class media_ponderada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            double valor1 = sc.nextDouble();
            double valor2 = sc.nextDouble();
            double valor3 = sc.nextDouble();

            double media = (valor1 * 2 + valor2 * 3 + valor3 * 5) / 10;

            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
