import java.util.Scanner;

public class lerNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        System.out.println("O número é: " + numero);
    }
}