import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int vezes = 0;

        for (int i = 0; i >= vezes; i++){
            System.out.print("Quantas vezes o elefante incomoda? ");
            vezes = scan.nextInt();
        }

        for (int c = 0; c < vezes; c++){
            System.out.print("Incomoda ");
        }

        System.out.println("Muito mais!");
    }
}
