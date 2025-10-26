public class OperadoresIncrementoDecremento {
    public static void main(String[] args) {
        //Integer numero = 10;
       // System.out.println("Numero antes: " + numero);

       // numero++;
       // System.out.println("Numero: depois: " + numero);


        Integer numero = 10;
         Integer numero02 = numero++;
        Integer numero03 = numero++;

        System.out.println("Número " + numero  + ", " + "Número02 " + numero02 + ", "  + "Número03 " +  numero03);
        //Neste caso quando o operador fica numero++, o valor numero é adicionado primeiro
        // sendo ele 10, mas quando esta do lado esquerdo ++numero, ele adiciona primeiro o ++
        // se tornando 11

       // Integer numero = 10;
       // --numero;
       // System.out.println("Número: " + numero);

    }
}