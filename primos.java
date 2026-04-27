import java.util.Scanner;

public class primos {
    public static void main(String[] args) {
        int i = 10;
        int inteiros[] = new int[i];
        Scanner scanner = new Scanner(System.in);
        

        for (int c = 0; c < inteiros.length; c++){
            System.out.println("Insira o número da posição " + c + "°: ");
            inteiros[c] = scanner.nextInt();}

        for (int c = 0; c < inteiros.length; c++){   
            boolean primo = true;
            if (inteiros[c] <=1 ) {
                primo = false;
            } else {
                for (int cont = 2; cont < inteiros[c]; cont++){
                    if (inteiros[c] % 2 == 0){
                        primo = false;
                        break;                        
                    }

                }

            }

            if (primo) {
                System.out.println("Número " + inteiros[c] + " na posição " + c + " é primo");
            }
        
        }
    scanner.close();
    }
}
