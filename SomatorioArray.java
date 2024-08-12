/**
 * Modele e implemente um método recursivo que calcule o somatório dos números contidos em um ArrayList de inteiros, passado como parâmetro.
 * 
 * int somatorioArray(arr[])
 * 
 * Caso Base:
 * somatorioArray(arr.size == 0) => 0
 * somatorioArray(arr.size == 1) => arr[0]
 * 
 * 
 * caso Recursivo:
 * 
 * somatorioArray(arr) => arr.size > 1 => arr[0] + somatorioArray(arr[1, arr.size])
 */

 public class SomatorioArray{

    public static int call(int[] arr) {
        if (arr.length == 0) return 0;
        else if (arr.length == 1) return arr[0];
        else {
            int[] newArr = new int[arr.length - 1];
            for (int i = 1; i < arr.length; i++) {
                newArr[i - 1] = arr[i];
            }
            return arr[0] + call(newArr);
        }
    }
 }