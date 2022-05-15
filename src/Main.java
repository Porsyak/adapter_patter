public class Main {
    public static void main(String[] args) {
        Ints cals = new IntsCalculatorAdapter();
        cals.mult(1,2);
        cals.pow(1,2);
        cals.sum(1,2);
    }
}
