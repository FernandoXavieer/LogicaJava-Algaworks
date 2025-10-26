import java.util.Scanner;

public class AlterandoValorVariavel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.print ("Digite o tipo do pagamento [1 = À vista / 2 = à prazo]:");
        Integer tipoPagamento = scanner.nextInt();

        Boolean pagamentoAVista = tipoPagamento.equals(1);
        //.equals() para selecionar e saber se se o pagamento é a vista ou nao, uma operação opções

        Double juros = 0.0;

        if (pagamentoAVista) {

        } else {
            juros = 10.0;
        }
        Double acrescimo = valorProduto * juros / 100;

        Double valorTotal = acrescimo + valorProduto;

        System.out.println("Valor total: " + valorTotal);


        


        scanner.close();
    }
}