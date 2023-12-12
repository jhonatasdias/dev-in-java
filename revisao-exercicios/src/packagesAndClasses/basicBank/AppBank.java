package packagesAndClasses.basicBank;

public class AppBank {

    public static void main(String[] args) {

        BanckAccount banckAccount = new BanckAccount();
        banckAccount.accountNumber = 15;
        banckAccount.accountHolder = "Jhon";
        banckAccount.balance = 500.00;

        System.out.println(banckAccount.accountNumber);
        System.out.println(banckAccount.accountHolder);
        System.out.println(banckAccount.balance);

    }

}
