/**
 * Modele e implemente um método recursivo que calcule o fatorial de um número n passado como parâmetro.
 * 
 * int fatorial(int n)
 * 
 * Casos Base:
 * fatorial(1) = 1
 * 
 * Casos de Erro:
 * fatorial(n<=0) = throw Exception
 * 
 * Casos Recursivos:
 * fatorial(n>1) = n * fatorial(n-1)
 * 
 * 
 */
public class Fatorial{

    public static int call(int n) throws Exception {
        if (n <= 0) throw new Exception("Erro: fatorial(0) = throw Exception");
        else if (n == 1) return 1;
        else return n * call(n - 1);
    }

}

