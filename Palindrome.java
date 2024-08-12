/**
 * Modele e implemente um método recursivo que recebe um String em retorna true se este String for um palíndrome, false caso contrário.
    ``` 
         boolean isPal(String s) 
    ```
    Caso Base:
    isPal("") = true
    isPal("a") = true
    isPal(str[0] != str[size -1]) = false

    Caso de Erro:
    isPal(null) = throw Exception

    Caso Recursivo:
    s.zise > 1 => isPal(s.substring(1, s.size()-1))

 */

public class Palindrome {

    public static boolean call(String s) throws Exception {
        if (s == null) throw new Exception("Erro: isPal(null) = throw Exception");
        else if (s.length() == 0 || s.length() == 1) return true;
        else if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        else if (s.charAt(0) == s.charAt(s.length() - 1)) return call(s.substring(1, s.length() - 1));
        else return false;
    }
    
}
