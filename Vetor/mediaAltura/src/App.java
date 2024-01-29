import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero de Pessoas.");
        int people = scan.nextInt();

        double[] mediaAltura = new double[people];

        for (int i = 0; i < people; i++) {
            System.out.println("Digite a altura");
            mediaAltura[i] = scan.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < people; i++) {
            soma += mediaAltura[i];
        }

        double media = soma / people;

        System.out.println("Media das Alturas: " + media);

        scan.close();
    }
}
