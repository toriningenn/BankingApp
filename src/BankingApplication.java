public class BankingApplication {
    public static void main(String[] args) {
        //welcome message with his name
        //5 options: check balance, deposit, withdraw, check previous transaction, exit.
        BankAccount Ivan = new BankAccount("Ivan", "9429384935");
        Ivan.showMenu();
    }
}
