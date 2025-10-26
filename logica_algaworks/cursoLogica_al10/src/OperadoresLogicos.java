public class OperadoresLogicos {
    public static void main(String[] args) {
        //OPERADOR && (E)
        //boolean carrinhoMaiorQue100 = false;
        //boolean periodoDePromocao = true;

        //  boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao;

        // if (aplicarDesconto){
        //    System.out.println("Sim ! Aplique o desconto. ");
        // } else {
        //     System.out.println("Não aplique o desconto. ");


        //OPERADOR LOGICO || (OU)
        //boolean carrinhoMaiorQue100 = false;
        //boolean periodoDePromocao = false;

        //boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao;


        //if (aplicarDesconto) {
         //   System.out.println("Sim ! Aplique o desconto. ");

      //  } else {
          //  System.out.println("Não aplique o desconto. ");

            //Misturando Operadores && , ||
            //Podemos colocar as condições em () para ter prioridade na hora de verificar as condições

            boolean carrinhoMaiorQue100 = false;
            boolean periodoDePromocao = false;
            boolean jaFezCompraNaLoja = true;
            boolean pagamentoAVista = true;

            boolean aplicarDesconto = periodoDePromocao && (carrinhoMaiorQue100 || jaFezCompraNaLoja) && pagamentoAVista;


            if (aplicarDesconto) {
                System.out.println("Sim ! Aplique o desconto. ");

            } else {
                System.out.println("Não aplique o desconto. ");



        }
    }
}