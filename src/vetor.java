public class vetor {

    public static void main(String[] args) {
        int[] numeros = {12, 14, 16, 18, 20};
        int soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }

        System.out.println("A soma dos numeros é: " + soma);
    }
}