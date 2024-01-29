package geradorDeSenhas;

public class Main {
    public static void main(String[] args) {

        SystemPasswordGenerator teste = new SystemPasswordGenerator();

        System.out.println("Senha Gerada: " + teste.generatePassword(8));

    }
}