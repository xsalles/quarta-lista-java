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

        System.out.println("\n" + B[0] * 2);
        System.out.println("\n" + B[1] * 2);
        System.out.println("\n" + B[2] * 2);
        System.out.println("\n" + B[3] * 2);
        System.out.println("\n" + B[4] * 2);
        System.out.println("\n" + B[5] * 2);
        System.out.println("\n" + B[6] * 2);
        System.out.println("\n" + B[7] * 2);

        sc.close();
    }
}
