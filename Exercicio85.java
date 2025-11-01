import java.util.Scanner;

public class Exercicio85 {

    public static double somaImposto(double taxaImposto, double custo) {
        
        return custo * (1 + taxaImposto / 100.0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double taxa, custoInicial;

        System.out.println("Programa para calcular o custo de um item com imposto.");

        System.out.print("Informe a taxa de imposto em porcentagem (ex: 10.0): ");
        taxa = scanner.nextDouble();

        System.out.print("Informe o custo inicial do item: ");
        custoInicial = scanner.nextDouble();

        double custoFinal = somaImposto(taxa, custoInicial);
        
        System.out.printf("O custo do item com imposto de %.2f%% é: R$ %.2f%n", taxa, custoFinal);

        scanner.close();
    }
}