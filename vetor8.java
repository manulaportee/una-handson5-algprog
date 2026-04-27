import java.util.Scanner;

public class vetor8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor[] = new int[8];

        for (int c = 0; c< vetor.length; c++){
            System.out.println("Insira o número da posição " + c + "°:");
            vetor[c] = scanner.nextInt();
        }

        System.out.println("Números positivos: ");
        for (int c = 0; c < vetor.length; c++){
            int inteiro = vetor[c];

            if (inteiro >= 0){
                System.out.print(inteiro + ", ");
            }
        }

        System.out.println("\nNúmeros negativo: ");
        for (int c = 0; c < vetor.length; c++){
            int negativo = vetor[c];

            if (negativo < 0){
                System.out.print(negativo + ", ");
            }
        }
    }
}
