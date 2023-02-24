public class BankAccount {
    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        amount=amount+sum;

    }
    public void withDraw(int sum) throws LimitException {
        if (sum>amount){
            throw new LimitException("Not enough amount to draw. Your account balance: ",amount);
        }else {
            amount=amount-sum;
            System.out.println("Your account balance now: "+amount);
        }

    }
}
