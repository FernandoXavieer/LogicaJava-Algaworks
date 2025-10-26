import java.util.Scanner;

public class aposentadoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final Integer IDADE_MINIMA_PARA_APOSENTAR = 55;
        final  Integer TEMPO_MINIMO_DE_CONTRIBUICAO = 25;

        System.out.print("Digite a sua idade: ");
        Integer idade = scanner.nextInt();

        System.out.print("Qual seu tempo de contribuição? ");
        Integer contribuicao = scanner.nextInt();;

        boolean temIdadeParaAposentar = idade >= IDADE_MINIMA_PARA_APOSENTAR;

        boolean temTempoDeContribuicaoSuficiente = contribuicao >= TEMPO_MINIMO_DE_CONTRIBUICAO;

        boolean podeAposentar = temIdadeParaAposentar && temTempoDeContribuicaoSuficiente;

        if (podeAposentar){
            System.out.println("Sim! Pode aposentar. ");
        }else {
            System.out.println("Não vai ser possivel aposentar agora: ");;

        }

    scanner.close();

    }
}