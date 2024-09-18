public class Account {
    // Attributes

    private String id;
    private String name;
    private int balance;

    // No argument constructor
    // public Account() {
    //     this.id = "1234";
    //     this.name = "John";
    //     this.balance = 200;
    // }

    // non-default constructor (Parametrized Constructor)
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // public void display() {
    //     System.out.println(this.id + ", " + this.name + ", " + this.balance);
    // }

    //  Methods

    public String getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    public int debit(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("\nAmount exceeded balance");
        }
        return this.balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("\nAmount exceeded balance");
        }
        return this.balance;
    }

    public String toString() {
        return ("The Account ID is : " + this.id + ", the Name of the account holder is :" + this.name
                + ", the balance is : " + this.balance);
    }
}
