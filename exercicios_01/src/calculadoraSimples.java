import java.util.Scanner;

public class calculadoraSimples {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.println("Digite o primeiro número: ");
            int num1 = scan.nextInt();

            System.out.println("Digite o segundo número: ");
            int num2 = scan.nextInt();

            int soma = num1 + num2;
            int sub = num1 - num2;
            int mult = num1 * num2;
            int div = num1 / num2;

            System.out.println("SOMA: " + soma);
            System.out.println("SUBTRAÇÃO: " + sub);
            System.out.println("MULTIPLICAÇÃO: " + mult);
            System.out.println("DIVISÃO: " + div);

        }
    }
}
