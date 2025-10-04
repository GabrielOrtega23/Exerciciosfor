public class PularMultiplos {
    public static void main(String[] args) {
        System.out.println("De 1 a 30 (sem múltiplos de 4):");

        // Laço para imprimir de 1 até 30
        for (int i = 1; i <= 30; i++) {
            // Se o número for múltiplo de 4, ele é pulado
            if (i % 4 == 0) {
                continue; // "continue" pula o resto do código e vai para o próximo laço
            }
            // Se não for múltiplo de 4, imprime
            System.out.print(i + " ");
        }
    }
}
