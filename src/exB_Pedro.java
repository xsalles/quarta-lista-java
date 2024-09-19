import java.util.Scanner;

public class exB_Pedro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[8];
        int[] B = A;

        for (int i = 0; i < 8; i++) {
            System.out.printf("Digite um número: \n");
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < 8; i++) {
            System.out.println(B[i] * 2);
        }

        sc.close();
    }
}
