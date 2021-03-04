import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores da carga Valor: ");
        double valor = sc.nextDouble();

        System.out.println("Peso: ");
        double peso = sc.nextDouble();

        Vagao vagao = new Vagao(valor, peso);
        Caminhao caminhao = new Caminhao(valor, peso);

        System.out.println("Os valores de frete para a carga informada Vagao: ");
        System.out.println(vagao.calculaFrete());

        System.out.println("Caminhao: ");
        System.out.println(caminhao.calculaFrete());

    }
}

