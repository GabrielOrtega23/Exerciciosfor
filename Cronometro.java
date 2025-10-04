import java.util.Scanner;

public class Cronometro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner para entrada

        // Pede ao usuário o valor final do cronômetro
        System.out.print("Digite até que número o cronômetro deve ir: ");
        int limite = sc.nextInt();

        // Laço para simular o cronômetro
        System.out.println("Cronômetro:");
        for (int i = 0; i <= limite; i++) { // começa em 0 e vai até o limite
            System.out.println(i + " segundos");

            // Caso queira simular o tempo real, descomente a linha abaixo:
            // try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }

        sc.close(); // Fecha o Scanner
    }
}
