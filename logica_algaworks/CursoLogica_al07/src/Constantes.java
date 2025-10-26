import java.util.Scanner;

public class Constantes {


    static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA = 18;
    //constante estatica
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final Integer idadeMinimaCarteira = 18;
        // para declarar uma constante não basta somente declarar a var
        // mas é preciso colocar (final) antes do tipo da var para ela se tornar constante

        System.out.print("Digite a sua idade: ");
        Integer idade = scanner.nextInt();


        Boolean podeTirarCarteira = idade >= idadeMinimaCarteira;

        if (podeTirarCarteira) {
            System.out.println("Sim! Ele{a} pode tirar carteira. ");
        } else {
            System.out.println("Não! Ele{a} nao pode tirar carteira. ");
        }
        scanner.close();
    }
}