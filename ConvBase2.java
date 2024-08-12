/**
 * Modele e implemente um método recursivo que recebe um inteiro zero ou positivo e retorna um String com o número em binário.
    ``` 
         String convBase2(int n) 
    ``` 

    Caso Base:
    convBase2(0) = "0"
    convBase2(1) = "1"

    Caso de Erro:
    convBase2(n<0) = throw Exception

    Caso Recursivo:
    convBase2(n>1) = convBase2(n/2) + n%2
 */

public class ConvBase2 {

    public static String call(int n) throws Exception {
        if (n < 0) throw new Exception("Erro: convBase2(n < 0) = throw Exception");
        else if (n == 0) return "0";
        else if (n == 1) return "1";
        else return call(n / 2) + n % 2;
    }

}