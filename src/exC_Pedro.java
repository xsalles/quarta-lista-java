import java.util.Scanner;

public class exC_Pedro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[20];
        int[] B = new int[20];
        int[] C = new int [20];

        for (int i = 0; i < 20; i++) {
            System.out.printf("""

                ********************
                    MATRIZ A

                    Digite todos os vinte números da matriz A:

                    """);
            A[i] = sc.nextInt();
        }

        System.out.println("ATENÇÃO, A PARTIR DE AGORA VAI SER INICIALIZADO PARA VOCÊ DIGITAR O VALOR DOS NÚMEROS DA MATRIZ B");

        for (int i = 0; i < 20; i++) {
            System.out.printf("""

                ********************

                    MATRIZ B

                    Digite todos os vinte números da matriz B:

                    """);
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(C[i] = A[i] - B[i]);
        }

        sc.close();
    }
}
