import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean rodar = true;

        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (rodar) {
            System.out.println("Bem-Vindo ao seu BANCO! Como podemos ajudar?");
            System.out.println("1) Depositar");
            System.out.println("2) Sacar");
            System.out.println("3) Ver Saldo");
            System.out.println("4) Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.print("Informe o valor do depósito: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.printf("Depósito realizado!\nNovo Saldo: R$%.2f\n", saldo);
                    break;
                }
                case 2: {
                    System.out.print("Informe o valor do saque: ");
                    double saque = scanner.nextDouble();
                    if (saldo < saque) {
                        System.out.printf("Você não possui saldo suficiente para sacar R$%.2f!\n", saque);
                    } else {
                        saldo -= saque;
                        System.out.printf("Saque de R$%.2f realizado:\n", saque);
                        System.out.printf("Saldo atual: R$%.2f\n", saldo);
                    }
                    break;
                }
                case 3: {
                    System.out.printf("Saldo atual: R$%.2f\n", saldo);
                    break;
                }
                case 4: {
                    System.out.println("Volte Sempre!");
                    rodar = false;
                    break;
                }
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println();  // Para adicionar uma linha em branco entre as operações
        }
        scanner.close();
    }
}