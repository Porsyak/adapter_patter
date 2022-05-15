public class IntsCalculatorAdapter extends Calculator.Formula implements Ints{

    @Override
    public Calculator.Formula sum(int arg0, int arg1) {
       return calculate(Calculator.Operation.SUB);
    }

    @Override
    public Calculator.Formula mult(int arg0, int arg1) {
        return calculate(Calculator.Operation.MULT);
    }

    @Override
    public Calculator.Formula pow(int a, int b) {
        return calculate(Calculator.Operation.POW);
    }
}
