public class ConcatenaçãoTextos {
    public static void main(String[] args) {
        String inicio = "Esse é o ";
        String meio = "º é um exemplo ";
        String fim = "sobre concatenação de textos";
        Integer numeroExemplo = 1;

        System.out.println(inicio + numeroExemplo +  meio + fim);

        System.out.println("Esse é o  " + numeroExemplo + meio + "sobre concatenação de textos");


    }
}