import java.util.Scanner;

public class AccountTerminal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        String agency;
        String client_name;
        float balance;

        System.out.println("Digite o número da sua agência:");
        number = Integer.parseInt(input.nextLine());
        System.out.println("Digite sua agência:");
        agency = input.nextLine();
        System.out.println("Digite o seu nome:");
        client_name = input.nextLine();
        System.out.println("Digite seu saldo:");
        balance = input.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco," +
                " sua agência é %s, conta %d  e seu saldo %.2f já está disponível para saque", client_name,agency,number,balance);


    }


}
