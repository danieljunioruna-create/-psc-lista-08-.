import java.util.Scanner;

public class Exercicio4 {

  
    public static char verificaPositivoNegativo(int numero) {
        if (numero > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite  um número inteiro: ");
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            char resultado = verificaPositivoNegativo(num);
            System.out.println("O resultado da verificação é: " + resultado);
        } else {
            System.out.println("Pelo amor de Deus a  antrada esta  inválida. Por favor, informe um número inteiro.");
        }
        scanner.close();
    }
}