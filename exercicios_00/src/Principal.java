import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        UsuarioModel usuarioA = new UsuarioModel();
        UsuarioModel usuarioB = new UsuarioModel();
        Scanner scanNum = new Scanner(System.in);
        Scanner scanText = new Scanner(System.in);


        System.out.println("(1) Cadastro usuário A");
        System.out.println("(2) Cadastro usuário B");
        System.out.println("(3) Lançamentos usuário A");
        System.out.println("(4) Lançamentos usuário B");
        System.out.println("(5) Transferencia usuário A para B");
        System.out.println("(6) Transferencia usuário B para A");
        System.out.println("(7) Imprimir informações dos usuários");
        System.out.println("(8) Sair");

        int opcao = scanNum.nextInt();

        while (true){

            if(opcao == 8){
                break;
            }

            switch (opcao){
                case 1:
                    System.out.println("CADASTRO USUÁRIO A: ");
                    usuarioA.cadastrarUsuario();
                    break;
                case 2:
                    System.out.println("CADASTRO USUÁRIO B: ");
                    usuarioB.cadastrarUsuario();
                    break;
                case 3:
                    System.out.println("Digite o valor do lançamento: ");
                    double valorLancamentoA = scanNum.nextDouble();
                    System.out.println("Digite o tipo de lançamento: ");
                    String tipoLancamentoA = scanText.nextLine();
                    usuarioA.realizarLancamento(valorLancamentoA, tipoLancamentoA);
                    break;
                case 4:
                    System.out.println("Digite o valor do lançamento: ");
                    double valorLancamentoB = scanNum.nextDouble();
                    System.out.println("Digite o tipo de lançamento: ");
                    String tipoLancamentoB = scanText.nextLine();
                    usuarioB.realizarLancamento(valorLancamentoB, tipoLancamentoB);
                    break;
                case 5:
                    System.out.println("Digite o valor da transferência: ");
                    double valorTransferenciaA = scanNum.nextDouble();
                    usuarioA.realizarTransferencia(usuarioB, valorTransferenciaA);
                    break;
                case 6:
                    System.out.println("Digite o valor da transferência: ");
                    double valorTransferenciaB = scanNum.nextDouble();
                    usuarioB.realizarTransferencia(usuarioA, valorTransferenciaB);
                    break;
                case 7:
                    usuarioA.imprimirInformacoes();
                    usuarioB.imprimirInformacoes();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println("Escolha outra opção: ");
            opcao = scanNum.nextInt();
        }
        System.out.println("Sistema encerrado.");
    }
}
