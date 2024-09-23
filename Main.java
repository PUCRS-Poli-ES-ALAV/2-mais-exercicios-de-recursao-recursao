public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Fatorial");
            System.out.println(Fatorial.call(5));
            System.out.println(Fatorial.call(-5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("==============================");
        System.out.println("Somatorio");
        System.out.println(Somatorio.call(5));
        System.out.println(Somatorio.call(-5));
        System.out.println("==============================");
        try {
            System.out.println("Fibonacci");
            System.out.println(Fibonacci.call(5));
            System.out.println(Fibonacci.call(-5));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("SomatorioIntervalado");
        System.out.println(SomatorioIntervalado.call(5, 10));
        System.out.println(SomatorioIntervalado.call(8, 5));
        System.out.println("==============================");
        System.out.println("Palindrome");
        try {
            System.out.println(Palindrome.call("arara"));
            System.out.println(Palindrome.call("arar"));
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("==============================");
        System.out.println("ConvBase2");
        try {
            System.out.println(ConvBase2.call(15));
            System.out.println(ConvBase2.call(-10));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("==============================");
        System.out.println("SomatorioArray");
        
        System.out.println("==============================");
        System.out.println("FindSubStr");
        try {
            System.out.println(FindSubStr.call("teste", "ste"));
            System.out.println(FindSubStr.call("teste", "tse"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("==============================");
        System.out.println("NroDigit");
        try {
            System.out.println(NroDigit.call(7));
            System.out.println(NroDigit.call(1560));
            System.out.println(NroDigit.call(389087));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}