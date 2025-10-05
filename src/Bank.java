public class Bank {
    private User user;
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Bank() {
    }

    public Bank(User user, int balance) {
        this.user = user;
        this.balance = balance;
    }

    private static boolean isBalance(int money, int balance) {
        if (money < balance)
            return true;
        return false;
    }



    public static boolean Transa(Bank recipient, Bank understander, int money) {
        if (isBalance(money, recipient.getBalance())) {
            recipient.balance -= money;
            understander.balance += money;
            // this.
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "user=" + user +
                ", balance=" + balance +
                '}';
    }
}
