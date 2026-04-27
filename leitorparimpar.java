import java.util.Scanner;

public class leitorparimpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor[] = new int[6];
        int c = 0, soma = 0, impar = 0;
        
        for (c = 0; c < vetor.length; c++){
            System.out.println("Insira o número da posição " + c + "°:");
            vetor[c] = scanner.nextInt();        
        }
//NUMEROS_PARES
        for (c = 0; c < vetor.length; c++){
            if (vetor[c] % 2 == 0){
                System.out.println("O número " +  vetor[c] + " é par");
                c++;
            }
        }
//SOMA_PARES
        for (c = 0; c < vetor.length; c++){
            soma = soma + vetor[c];
            c++;
        }
        System.out.println("A soma dos números pares inseridos é: " + soma);
//NUMEROS_IMPARES
         for (c = 0; c < vetor.length; c++){
            if (vetor[c] % 2 == 1){
                System.out.println("O número " +  vetor[c] + " é ímpar");
                c++;
            }
        }
//QUANTIDADE_IMPARES
        for (c = 0; c < vetor.length; c++){
            if (vetor[c] % 2 == 1){
            impar++;
            }
        }
        System.out.println("A quantidade de números ímpares inseridos é de " + impar + " números.");
       
        scanner.close();
    }
}
