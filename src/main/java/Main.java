import javax.swing.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = teclado.nextInt();

        int soma = a + b;
        System.out.println("A soma é: " + soma);

        if (soma >10) {
            System.out.println("Soma invalida");
        }

        else if (soma > 5) {
            System.out.println("Aprovado");

        }
        else if (soma == 5)  {
            System.out.println("Recuperação");
        }
        else if (soma <5) {
            System.out.println("Reprovado");

        }

    }
}
