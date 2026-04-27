import java.util.Arrays;

public class vetorresultante {
    public static void main(String[] args) {
       int vetor1[] = {3, 5, 4, 2, 2, 5, 3, 2, 5, 9};
        int vetor2[] = {7, 15, 20, 0, 18, 4, 55, 23, 8, 6};
        int intercalacao[] = new int[vetor1.length + vetor2.length];

        int k = 0;

        for (int i = 0; i < vetor1.length; i++) {
            intercalacao[k++] = vetor1[i];
            intercalacao[k++] = vetor2[i];
        }

        for (int num : intercalacao) {
            System.out.print(num + " ");
        }
    }
}
