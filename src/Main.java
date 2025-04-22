import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu CPF (apenas números): ");
        String cpf = scanner.nextLine();

        if (validarTamanhoCpf(cpf)) {
            System.out.println("Bem vindo(a)!");
        } else {
            System.out.println("Numero digitado de forma incorreta. Tente novamente mais tarde.");
        }

        scanner.close();
    }

    public static boolean validarTamanhoCpf(String cpf) {
        return cpf != null && cpf.length() == 11 && cpf.matches("\\d+");

    }
}