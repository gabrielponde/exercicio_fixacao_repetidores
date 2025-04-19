package exercicio_while.exercicio_while_3;

import java.util.Scanner;

public class combustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Digite o código do combustível (1.Álcool 2.Gasolina 3.Diesel 4.Fim):");

        int codigo = sc.nextInt();

        while (codigo != 4) {
            while (codigo < 1 || codigo > 4) {
                System.out.println("Código inválido. Digite novamente:");
                codigo = sc.nextInt();
            }

            if (codigo == 1) {
                alcool++;
            } else if (codigo == 2) {
                gasolina++;
            } else if (codigo == 3) {
                diesel++;
            }

            codigo = sc.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
