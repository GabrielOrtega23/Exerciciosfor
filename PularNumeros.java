import java.util.Scanner;

public class PularNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner para entrada de dados

        // Pede ao usuário de quanto em quanto deve pular
        System.out.print("Digite um número para o salto (ex: 5): ");
        int salto = sc.nextInt();

        // Imprime de salto em salto até 100
        System.out.println("Imprimindo de " + salto + " em " + salto + " até 100:");
        for (int i = 1; i <= 100; i += salto) { // i aumenta de acordo com o salto
            System.out.print(i + " ");
        }

        sc.close(); // Fecha o Scanner
    }
}
