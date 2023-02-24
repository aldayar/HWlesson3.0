public class Main {
    public static void main(String[] args) {
        BankAccount ba= new BankAccount(20000);

        while (true){
            try {
                ba.withDraw(6000);
            } catch (LimitException e) {
                System.out.println("Your balance is not enough to do.Your balance: "+e.getRemainingAmount());
                try {
                    ba.withDraw((int) e.getRemainingAmount());
                    System.out.println("withdrawn from last balance: "+e.getRemainingAmount());
                } catch (LimitException ex) {
                    System.out.println("Error while withdraw money: "+ex.getMessage());
                }
                break;
            }

        }
    }
}