



public class Main {
    public static void main(String[] args) {

        User madi =  new User("Madi", "madi@mail.com");
        User djora =  new User("Djora", "djora@mail.com");

        Bank account_madi = new Bank(madi, 20000);
        Bank account_djora = new Bank(djora, 100);


        System.out.println(account_madi.toString());
        System.out.println(account_djora.toString());

        System.out.println(Bank.Transa(account_madi, account_djora, 10000));
        //System.out.println(Bank.Transa(account_djora, account_madi,  101));

        System.out.println(account_madi.toString());
        System.out.println(account_djora.toString());

    }
}