import java.util.Scanner;

import controller.Hotel;
import entity.Register;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        Register[] register = new Register[10];

        System.out.println("Quantos quartos voce deseja alugar?");
            int quantityRooms = scan.nextInt();
        
        if (quantityRooms > Hotel.MAXIMUN_ROOMS) {
            throw new IllegalArgumentException("Numero de quartos excedidos");   
        }

        for (int i = 1; i <= quantityRooms; i++){
            System.out.println("Cadastro");
        System.out.println("Nome: ");
            String name = scan.next();
        System.out.println("Email: ");
            String email = scan.next();
        System.out.println("CPF: ");
            String cpf = scan.next();
        System.out.println("Numero do Quarto: ");
            int roomNumber = scan.nextInt();
        
        register[roomNumber] = new Register(name, email, cpf);

        System.out.println("Cadastro Realizado!");
        System.out.println(register[roomNumber].toString());
        }
    scan.close();
    }
}
