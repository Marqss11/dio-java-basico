package EscolaExemplo;
import java.util.Scanner;

public class Escola {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aluno bruno = new Aluno();
        System.out.println("Informe o nome do Aluno: ");
		bruno.setNome(scanner.next());
        System.out.println("Informe a idade do Aluno: ");
		bruno.setIdade(scanner.nextInt());
		
		System.out.println("O aluno " + bruno.getNome() + " tem " + bruno.getIdade() + " anos ");	
	}
}