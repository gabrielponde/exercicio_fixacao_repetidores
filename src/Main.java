import java.util.Locale;
import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//        double largura = sc.nextDouble();
//        double comprimento = sc.nextDouble();
//        double metroQuadrado = sc.nextDouble();
//        double area = largura * comprimento;
//        double preco = area * metroQuadrado;
//        System.out.printf("AREA = %.2f%n", area);
//        System.out.printf("PRECO = %.2f%n", preco);
//        sc.close();
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int x = sc.nextInt();
//
//        int soma = 0;
//        while (x != 0) {
//            soma += x;
//
//            x = sc.nextInt();
//        }
//        System.out.println(soma);
//
//        sc.close();
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//
//        int soma = 0;
//
//        for (int i = 0;i < N; i++) {
//
//            int x = sc.nextInt();
//            soma += x;
//
//        }
//        System.out.println(soma);
//
//        sc.close();
//    }
//}

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char resp;
        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);
        } while (resp != 'n');
        sc.close();
    }
}