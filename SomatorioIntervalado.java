/**
 * Modele e implemente um método recursivo que calcule o somatório dos números inteiros entre os números k e j, passados como parâmetro.
 * int somatorioIntervalado(k, j)
 * 
 * Caso Base:
 * somatorioIntervalado(k, j) => k == j => k
 * 
 * caso de Erro:
 * None
 * 
 * caso Recursivo:
 * somatorioIntervalado(k, j) => k < j => k + somatorioIntervalado(k+1, j)
 * somatorioIntervalado(k, j) => k > j => k + somatorioIntervalado(k-1, j)
 * 
 */

 public class SomatorioIntervalado{

    public static int call(int k, int j) {
        if (k == j) return k;
        else if (k < j) return k + call(k + 1, j);
        else return k + call(k - 1, j);
    }
 }