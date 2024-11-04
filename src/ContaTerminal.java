import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        // Solicitação e leitura de dados do usuário
        System.out.println("Por favor, digite o número da Conta:");
        numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt

        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo:");
        saldo = scanner.nextDouble();

        // Exibição da mensagem formatada
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        // Fechamento do scanner
        scanner.close();
    }
}
