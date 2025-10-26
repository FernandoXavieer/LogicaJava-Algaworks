import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        double frete = 15.00;

        if (valorProduto >= 100) {
            frete = 0.0;
        }else {
            frete = 15.00;
            }

        double valorFinal =  valorProduto + frete;


        System.out.println("Valor final: " + valorFinal );


    }
}