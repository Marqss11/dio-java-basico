import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o saldo atual: ");
        double saldo = scanner.nextDouble();
        System.out.print("Informe o valor do saque: ");
        double saque = scanner.nextDouble();
        double limiteChequeEspecial = 500;

        // TODO: Verifique se o saque não ultrapassa o saldo disponível na conta:
        if (saque <= saldo) {
            System.out.println("Transação realizada com sucesso!");
        } else {
            // TODO: Verifique se o saque ultrapassa o limite do cheque especial, mas não o saldo total disponível:
            if (saque <= saldo + limiteChequeEspecial) {
                System.out.println("Transação realizada usando cheque especial.");
            } else {
                // Se o saque ultrapassar tanto o saldo disponível quanto o limite do cheque especial
                System.out.println("Transação não realizada. Limite do cheque especial excedido.");
            }
        }

        // Fechamos o objeto Scanner para liberar os recursos:
        scanner.close();
    }
}
