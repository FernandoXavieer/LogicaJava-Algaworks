public class TipoLogico {
    public static void main(String[] args) {
        boolean variavelVerdadeira = true;
        System.out.println("Variável verdadeira " + variavelVerdadeira);

        boolean variavelFalsa = false;
          System.out.println("Variável falsa " + variavelFalsa);

        System.out.println(" --------------------- ");

        Integer idade = 20;

        boolean podeTirarCartiera = idade >= 18;

        if (podeTirarCartiera) {
            System.out.println("Sim, pode tirar carteira. ");
        } else {
            System.out.println("Não pode tirar carteira");
        }

        // System.out.println("Pode tirar carteira? " + podeTirarCartiera);


    }

}