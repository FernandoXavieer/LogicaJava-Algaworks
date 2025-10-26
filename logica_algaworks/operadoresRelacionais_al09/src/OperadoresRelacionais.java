public class OperadoresRelacionais {
    public static void main(String[] args) {
      boolean tresMaiorQueDois = 3 > 2;
        System.out.println("3 > 2? " + tresMaiorQueDois);

        boolean tresMenorQueDois = 3 < 2;
        System.out.println("3 < 2? " + tresMenorQueDois);

        boolean tresMaiorQueTres = 3 > 3;
        System.out.println("3 > 3? " + tresMaiorQueTres);

        boolean tresMaiorOuIgualATres = 3 >= 3;
        System.out.println("3 >= 3? " + tresMaiorOuIgualATres);

        boolean tresMenorOuIgualATres = 3 <= 3;
        System.out.println("3 <= 3? " + tresMenorOuIgualATres);

        boolean doisIgualADois = 2 == 2;
        System.out.println("2 == 2? " + doisIgualADois);
        // o operador == so funciona ate o numero 127 em variais do tipo normal
        //INTEGER. O java so retorna true em tipos normais ate 127
        //para dar certo teriamos que usar o equals()

        boolean doisDiferenteDeDois = 2 != 2;
        System.out.println("2 != 2? " + doisDiferenteDeDois);

        Integer quatro = 4;
        boolean quatroMaiorQueQuatro = quatro > quatro;
        System.out.println("quatro > quatro? " + quatroMaiorQueQuatro);

        Integer cinco = 5;
        boolean cincoMaiorOuIgualACinco = cinco >= cinco;
        System.out.println("cinco >= cinco? " + cincoMaiorOuIgualACinco);

        Integer seis = 6;
        boolean seisIgualASeis = seis.equals(seis);
        System.out.println("seis.equals(seis)?" + seisIgualASeis);

        Integer sete = 7;
        boolean seisIgualASete = seis.equals(sete);
        System.out.println("seis.equals(sete)?" + seisIgualASete);

        Integer centoVinteOito = 128;
        Integer centoVinteOito02 = 128;
        Boolean centoVinteOitoIgualCentoVinteOito = centoVinteOito.equals(centoVinteOito02);
        System.out.println("centoVinteOito.equals(centoVinteOito02)? " + centoVinteOitoIgualCentoVinteOito);

        // Notas importantes de se lembrar sobre o operador "==":
        //    * O Java só consegue comparar os tipos normais, através do operador "==", com números que
        //	estão no intervalo de "-128" até "127". Fora desse intervalo, o operador "==" pode causar muita
        //  confusão quando utilizado com os tipos normais. Utilizado juntamente com os primitivos (que,
        //  nesse caso, seria o "int" ao invés de "Integer") o operador "==" funciona para qualquer número.
        //    * Caso você utilize a mesma variável, o operador "==" vai funcionar até para os tipos
        //  normais. Isso porque o valor de uma variável sempre será igual a ele mesmo. Repare que, em nosso
        //  exemplo, utilizamos duas variáveis com o mesmo valor, pois, isso é o que acontece no "mundo real".
        Boolean centoVinteOitoIgualCentoVinteOito02 = centoVinteOito == centoVinteOito02;
        System.out.println("centoVinteOito == centoVinteOito02? " + centoVinteOitoIgualCentoVinteOito02);








    }
}