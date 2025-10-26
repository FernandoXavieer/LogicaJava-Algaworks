import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        Double n1 = scanner.nextDouble();

        System.out.print("Operação: [1 = + | 2 = - | 3 = * | 4 = / ]: ");
        Integer operacao = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        Double n2 = scanner.nextDouble();

        Double resultado = null;

        if (operacao.equals(1)){
            resultado = n1 + n2;
        }

        if (operacao.equals(2)) {
            resultado = n1 - n2;
        }

        if (operacao.equals(3)){
            resultado = n1 * n2;
        }

        if (operacao.equals(4)){
            resultado = n1 / n2;
        }

        System.out.println("O resultado da sua operação é: " + resultado);

        scanner.close();

    }
}