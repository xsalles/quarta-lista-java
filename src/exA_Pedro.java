import java.util.Arrays;
import java.util.Scanner;

public class exA_Pedro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] names = new String[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um nome: \n");
            names[i] = sc.nextLine();
        }

        System.out.println(Arrays.toString(names));

        sc.close();
    }
}
