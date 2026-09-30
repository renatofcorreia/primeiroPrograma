import java.util.Scanner;

public class tabuada {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero entre 1 e 10: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "x" + i + " = "+ (numero * i));
        }
    }
}
