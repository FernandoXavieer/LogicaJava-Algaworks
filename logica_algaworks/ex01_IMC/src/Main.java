import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculo de IMC");
        System.out.print("Digite o seu peso em Kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura: ");
        Double altura = scanner.nextDouble();

        double resultadoIMC = peso / (altura * altura);

        System.out.println("Seu IMC é: " + resultadoIMC);

        scanner.close();
    }

}