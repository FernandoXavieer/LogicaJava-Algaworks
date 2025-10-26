import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final Integer notaMinimaAluno = 70;
        // a nota se tornou uma constante

        System.out.print("Digite a sua nota: ");
        double notaAluno = scanner.nextDouble();


        boolean passouDeAno = notaAluno >= notaMinimaAluno;

        if(passouDeAno){
            System.out.println("Parabens! Você passou de ano.");
        } else {
            System.out.println("Infelizmente, ficou de recuperação");
        }
    }
}