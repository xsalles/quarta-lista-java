import java.util.Arrays;
import java.util.Scanner;

public class exF_Pedro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[15];
        int[] B = new int[15];
        int[] C = new int[30];


        for (int i = 0; i < 15; i++) {
            System.out.println("""

                    ***************

                    MATRIZ A

                    Digite um número

                    """);
            A[i] = sc.nextInt();

        }

        for (int j = 0; j < 15; j++) {
            System.out.println("""
        
                ***************

                MATRIZ B

                Digite um número

                """);
        B[j] = sc.nextInt();
        }

        
            

        System.arraycopy(A, 0, C, 0, 14);
        System.arraycopy(B, 0, C, 15, 14);

        System.out.printf(Arrays.toString(C));

        sc.close();
    }
}
