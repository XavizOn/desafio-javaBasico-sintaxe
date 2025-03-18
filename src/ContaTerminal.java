import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    private String nomeCliente;
    private int numeroAgencia;
    private String numeroConta;
    private double saldoEmConta;

    public ContaTerminal(String nomeCliente, int numeroAgencia, String numeroConta, double saldoEmConta) {
        this.nomeCliente = nomeCliente;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldoEmConta = saldoEmConta;
    }    
    
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Título da aplicação
        System.out.println("   ******BEM VINDO AO BANCO TEXTE******");
        System.out.println("***Iniciando Processo de Abertura de Conta***");
        System.out.println("_____________________________________________");

        
        System.out.println("Digite o número da agência: "); 
        int numeroAgencia = scanner.nextInt();
        scanner.nextLine(); //Consumir quebra de linha

        System.out.println("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();        

        System.out.println("Por favor digite seu nome: ");
        String nomeCliente = scanner.nextLine();

       
       
        ContaTerminal conta = new ContaTerminal(nomeCliente, numeroAgencia, numeroConta, 0.0);

        System.err.println("Olá " + conta.nomeCliente + ", obrigado por criar uma conta conosco.");
        System.err.println("Sua agência é a " + conta.numeroAgencia + ", Conta número " + conta.numeroConta);
        System.err.println("Seu saldo inícial é de " + conta.saldoEmConta + ", já disponival para saque");



        scanner.close();   
                
    }
}
