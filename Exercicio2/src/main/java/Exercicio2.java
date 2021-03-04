import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Icms i = new Icms();
        Ipi p = new Ipi();
        Cofins c = new Cofins();

        System.out.println("Digite o valor ");

        double v = scan.nextDouble();

        i.calculaImposto(v);
        p.calculaImposto(v);
        c.calculaImposto(v);

        System.out.println("O imposto de ICMS é " + i.getValor());
        System.out.println("O imposto de IPI é " + p.getValor());
        System.out.println("O imposto de COFINS é " + c.getValor());
    }
}
