import java.util.Scanner;

public class Exercicio1For {
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println("Números pares até " + numero + ":");
        for (int par = 0; par <= numero; par += 2) {
            System.out.print(par + " ");
        }
    }
}
