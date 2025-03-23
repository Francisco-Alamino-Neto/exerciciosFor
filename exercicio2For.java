import java.util.Scanner;

public class exercicio2For {
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println("Números até " + numero + ":");
        for (int i = 1; i <= numero; i ++) {
            System.out.print(i + " ");
        }
    }
}