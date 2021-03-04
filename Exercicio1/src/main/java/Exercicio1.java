import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o Primeiro número: ");
        int a = scan.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = scan.nextInt();

        System.out.print("Digite o terceiro número: ");
        int c = scan.nextInt();

        System.out.print("Digite o quarto número: ");
        int d = scan.nextInt();

        System.out.print("Digite o quinto número: ");
        int e = scan.nextInt();

        if (a > b && a > c && a > d && a > e) {
            System.out.println("O número " + a + " é o maior da sequência");
        } else if (b > a && b > c && b > d && b > e) {
            System.out.println("O número " + b + " é o maior da sequência");
        } else if (c > a && c > b && c > d && c > e) {
            System.out.println("O número " + c + " é o maior da sequência");
        } else if (d > a && d > b && d > c && d > e) {
            System.out.println("O número " + d + " é o maior da sequência");
        } else if (e > a && e > b && e > c && e > d) {
            System.out.println("O número " + e + " é o maior da sequência");
        }

        if (a < b && a < c && a < d && a < e) {
            System.out.println("O número " + a + " é o menor da sequência");
        }else if (b < a && b < c && b < d && b < e){
            System.out.println("O número " + b + " é o menor da sequência");
        }else if (c < a && c < b && c < d && c < e){
            System.out.println("O número " + c + " é o menor da sequência");
        }else if (d < a && d < b && d < c && d < e){
            System.out.println("O número " + c + " é o menor da sequência");
        }else if (e < a && e < b && e < c && e < d){
            System.out.println("O número " + e + " é o menor da sequência");
        }

        if (a == b && b == c && c == d && d == e){
            System.out.println("Os cinco números são iguais");
        }
    }
}
