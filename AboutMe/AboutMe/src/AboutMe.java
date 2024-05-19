import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        try{
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Informe seu nome: ");
        String nome = scanner.next();
        
        System.out.println("Informe seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.println("Informe sua altura: ");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();
        } 
        catch(InputMismatchException e){
            System.out.println("Os campos Idade e Altura devem ter valores númericos");
        }
    }
}