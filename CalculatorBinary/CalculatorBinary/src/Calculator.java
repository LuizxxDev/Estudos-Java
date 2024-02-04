public class Calculator {
    
    private final int DIVIDER = 2;

    public String CalculatorBinary(int number){

        int rest;

        StringBuilder binary = new StringBuilder();

        if(Double.toString(number).contains(",")){
            throw new IllegalStateException("O Numero: " + number + "nao é um decimal");
        }
        while (number > 0) {
                rest = number % DIVIDER;
                binary.append(rest);
                number /= 2;
        }

        return binary.toString();

        }
}
