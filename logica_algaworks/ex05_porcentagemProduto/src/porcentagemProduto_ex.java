import java.util.Scanner;

public class porcentagemProduto_ex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.print("Digite a quantidade do produto: ");
        Integer quantidade = scanner.nextInt();

        Double valorSubtotal = valorProduto * quantidade;

        Boolean quantidadeMaiorOuIgualADez = quantidade >= 10;

        Double percentualDesconto = 0.0;

        if (quantidadeMaiorOuIgualADez) {
            percentualDesconto = 10.0;
        }

        Double desconto = valorSubtotal * percentualDesconto / 100;

        Double valorTotalComDesconto = valorSubtotal - desconto;

        System.out.println("Valor total: " + valorTotalComDesconto);

        scanner.close();



    }
}