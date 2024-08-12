/**
 * Modele e implemente um método recursivo que calcule o somatório de um número n (passado como parâmetro) até 0.
 * 
 * int somatorio(n)
 * 
 * Caso Base:
 * somatorio(0) = 0
 * somatorio(1) = 1
 * 
 * caso de Erro:
 * None
 * 
 * caso Recursivo:
 * somatorio(n>=0) = n + somatorio(n-1)
 * somatorio(n<=0) = n + somatorio(n+1)
 * 
 */

 public class Somatorio{

    public static int call(int n) {
        if (n == 0 || n == 1) return n;
        else if (n > 0) return n + call(n - 1);
        else return n + call(n + 1);
    }
 }