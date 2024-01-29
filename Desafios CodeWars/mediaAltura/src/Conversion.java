public class Conversion {

    public static void main(String[] args) {
        
        System.out.println(solution(10));


    }
    
    public static String solution(int numero){
        if (numero < 1 || numero > 3999) {
            throw new IllegalArgumentException("O número deve estar no intervalo de 1 a 3999");
        }

        String[] simbolos = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] valores = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        StringBuilder resultado = new StringBuilder();
        int indice = 12; 

        while (numero > 0) {
            int divisor = numero / valores[indice];
            numero %= valores[indice];
            while (divisor > 0) {
                resultado.append(simbolos[indice]);
                divisor--;
            }
            indice--;
        }

        return resultado.toString();
    }

}
