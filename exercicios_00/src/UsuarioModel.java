import java.util.Scanner;

public class UsuarioModel {

    private String nome;
    private String cpf;
    private String dataNasc;
    private String genero;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public void cadastrarUsuario(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Nome: ");
        nome = scan.nextLine();
        System.out.println("CPF: ");
        cpf = scan.nextLine();
        System.out.println("Data de nascimento: ");
        dataNasc = scan.nextLine();
        System.out.println("Gênero: ");
        genero = scan.nextLine();
        System.out.println("Salário: ");
        salario = scan.nextDouble();
    }

    public void realizarLancamento(double valorLancamento, String tipoLancamento){
        if(tipoLancamento.equals("crédito")){
            setSalario(getSalario() + valorLancamento);
        }
        if(tipoLancamento.equals("débito")){
            setSalario(getSalario() - valorLancamento);
        }
    }

    public void realizarTransferencia(UsuarioModel usuarioDestino, double valorTransferencia){
        setSalario(getSalario() - valorTransferencia);
        usuarioDestino.realizarLancamento(valorTransferencia, "crédito");
    }

    public void imprimirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de nascimento: " + dataNasc);
        System.out.println("Gênero: " + genero);
        System.out.println("Salário: " + salario);
    }





}
