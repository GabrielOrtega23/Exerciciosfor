import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner para ler dados do usuário

        // Pede um número ao usuário
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = sc.nextInt();

        // Laço de repetição para imprimir a tabuada do número escolhido
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) { // vai de 1 até 10
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        sc.close(); // Fecha o Scanner
    }
}
