public class TestAccount {
    public static void main(String[] args) {
        Account Acc1 = new Account("0001", "Anne", 5000);
        Account Acc2 = new Account("0002", "John", 4000);
        
        
        // Initial balances of both accounts
        System.out.println("Initial Balances:");
        System.out.println("Account 1: " + Acc1.getID() + ", " + Acc1.getName() + ", Balance: $" + Acc1.getBalance());
        System.out.println("Account 2: " + Acc2.getID() + ", " + Acc2.getName() + ", Balance: $" + Acc2.getBalance());

        // Crediting $100 to Account 1
        Acc1.credit(100);

        System.out.println("\nBalance After Crediting $100 To Account 1:");
        System.out.println("Account 1: " + Acc1.getID() + ", " + Acc1.getName() + ", Balance: $" + Acc1.getBalance());

        // Debiting $50 from Account 2
        Acc2.debit(4100);
        System.out.println("As $4100 Cannot Be Deducted, Hence The Balance In Account 2 Remains Same:");
        System.out.println("Account 2: " + Acc2.getID() + ", " + Acc2.getName() + ", Balance: $" + Acc2.getBalance());

        // Transfer $1000 from Acc1 to Acc2
        Acc1.transferTo(Acc2, 1000);

        // Display balances after the transfer
        System.out.println("\nBalances After Transfering $100 From Account 1 to Account 2:");
        System.out.println("Account 1: " + Acc1.getID() + ", " + Acc1.getName() + ", Balance: $" + Acc1.getBalance());
        System.out.println("Account 2: " + Acc2.getID() + ", " + Acc2.getName() + ", Balance: $" + Acc2.getBalance());
    }
}
