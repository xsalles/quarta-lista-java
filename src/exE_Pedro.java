import java.util.Scanner;

public class exE_Pedro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[15];
        int[] B = new int[15];
        int fatorial = 1;
    

        for (int i = 0; i < 15; i++) {
            System.out.println("""

                    Digite um número inteiro e irei te retornar o fatorial dele.
                    
                    (Essa mensagem irá aparecer 15 vezes)

                    """);
            A[i] = sc.nextInt();
                

        }
        
        for (int i = 1; i <= A[i]; i++) {
            fatorial = fatorial * A[i];

            B[i] = fatorial;

            System.out.printf("\nO fatorial de %d, é %d\n", A[i], B[i]);
        }

        sc.close();
    }
}
