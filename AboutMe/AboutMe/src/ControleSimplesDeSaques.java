import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        // Laço for para iterar sobre tentativas de saque, número de tentativas é indefinido, então usamos um loop infinito
        for (int i = 0; true; i++) {

            double valorSaque = scanner.nextDouble();

            // Verifica se o valor do saque ultrapassa o limite diário
            if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop se o limite for excedido
            } else {
                limiteDiario -= valorSaque; // Subtrai o valor do saque do limite diário
                System.out.printf("Saque realizado. Limite restante: %.1f\nTransacoes encerradas.", limiteDiario);
            }
        }

        scanner.close(); // Fechamos o Scanner para evitar vazamento de recursos
    }
}
