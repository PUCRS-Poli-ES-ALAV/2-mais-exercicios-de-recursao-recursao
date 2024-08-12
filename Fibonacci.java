/**
 * Modele e implemente um método recursivo que calcule o n-ésimo número da sequência de fibonacci.
 * 
 * int fibonacci(int n)
 * 
 * Casos Base:
 * fibonacci(1) = 1 
 * fibonacci(2) = 1
 * 
 * Casos de Erro:
 * fibonacci(n<=0) = throw Exception
 * 
 * Casos Recursivos:
 * fibonacci(n>2) = fibonacci(n-1) + fibonacci(n-2)
 * 
 * 
 */

public class Fibonacci {
    public static int call(int n) throws Exception {
        if(n <= 0) throw new Exception("Erro: fibonacci(n <= 0) = throw Exception");
        else if(n == 1 || n == 2) return 1;
        else return call(n - 1) + call(n - 2);
    }
}
