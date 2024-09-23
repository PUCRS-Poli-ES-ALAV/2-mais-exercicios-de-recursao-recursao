public class NroDigit {
    public static int call(int n) {
        if (Math.abs(n) < 10) return 1;
        else return call(n / 10) + 1;
    }
}