import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0.0;

        System.out.println("Digite o valor da sua conta de luz: ");
       total += scanner.nextDouble();

        System.out.println("Digite o valor da sua conta de água: ");
        total += scanner.nextDouble();

        System.out.println("Digite o valor da sua conta de telefone: ");
        total += scanner.nextDouble();

        System.out.println("Digite o valor da escola do filho: ");
        total +=  scanner.nextDouble();

        System.out.println("Digite o valor da sua fatura do cartão: ");
        total +=  scanner.nextDouble();

        System.out.println("Digite o valor dos gastos com supermercado: ");
        total +=  scanner.nextDouble();

        System.out.println(" O gasto total foi de: " + total);

        scanner.close();






    }
}