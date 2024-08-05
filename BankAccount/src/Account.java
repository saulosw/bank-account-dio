import java.util.Scanner;
import java.util.Locale;

public class Account {
    String agency;
    String username;
    int accountNum;
    double balance;

    public Account(String username, String agency, int accountNum, double balance) {
        this.username = username;
        this.agency = agency;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public void displayAccountInfo() {
        System.out.println("Olá " + username + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agency + 
        "\nConta " + accountNum + " e seu saldo de " + balance + " já está disponível para saque.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        String username = promptForInput(scanner, "Por favor, digite seu nome: ");
        String agency = promptForInput(scanner, "Por favor, digite o número da agência: ");
        int accountNum = promptForInt(scanner, "Por favor, digite o número da conta: ");
        double balance = promptForDouble(scanner, "Por favor, digite seu saldo da conta: ");

        Account account = new Account(username, agency, accountNum, balance);
        account.displayAccountInfo();

    }

    private static String promptForInput(Scanner scanner, String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    private static int promptForInt(Scanner scanner, String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }

    private static double promptForDouble(Scanner scanner, String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }
}
