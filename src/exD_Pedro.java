import java.util.Scanner;

public class exD_Pedro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[15];
        int[] B = new int[15];

        for (int i = 0; i < 15; i++) {
            System.out.println("\nDigite um número inteiro (Irá ter essa pergunta 15 vezes)\n");
            A[i] = sc.nextInt();

            B[i] = A[i] * A[i];

        }
        
        for (int i = 0; i < 15; i++) {
            System.out.printf("\n%d ao quadrado é, é %d \n", A[i], B[i]);
            
        }

        sc.close();
    }
}
