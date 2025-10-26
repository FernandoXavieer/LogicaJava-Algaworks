public class OperadoresAritmeticos {
    public static void main(String[] args) {
        Integer adicao = 1+1;
        System.out.println("Adição: " + adicao );

        Integer subtracao = 1  - 1;
        System.out.println("Sub: " + subtracao  );

        Integer multiplicacao = 2 * 2;
        System.out.println("multiplicação: "+ multiplicacao);

        Integer divisao = 4 / 2;
        System.out.println("divisão: "+ divisao);

        Integer modulo = 7 % 4;
        System.out.println("Módulo: "+ modulo);
        //modulo é o resto da divisão. ex 7/4 sobra 3

        Integer precedencia01 = 1 + 1 * 5;
        System.out.println("Precedencia "+ precedencia01);

        Integer precedencia02 = (1 + 1) * 5;
        System.out.println("Precedencia  "+ precedencia02);
        //quando colocamos a soma entre () ela passa a ter
        //a precedencia e é calculada primeiro

        Integer precedencia03 = 5 * (1 + 1);
        System.out.println("Precedencia  "+ precedencia03);
        //neste caso também

        Integer precedencia04 = 5 * (1+1) + 2;
        System.out.println("Precedencia "+ precedencia04);

        Integer precedencia05 = 5 * ((1+1) + 2);
        System.out.println("Precedencia "+ precedencia05);
        //aqui damos a precedencia para as somas primeiro ex
        //1+1 depois ainda entre () 2+2 e por ultimo a multiplicação


        Integer cinco = 5;
        Integer um = 1;

        Integer precedenciaComVariaveis = cinco *(um + um);
        System.out.println("Precedencia com variaveis " + precedenciaComVariaveis );



    }
}