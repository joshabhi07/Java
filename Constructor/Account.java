public class Account {
    int acc_id;
    String acc_name;

public Account(int id, String name) {
        // Constructor
        this.acc_id = id;
        this.acc_name = name;        
    }
    public static void main(String[] args) {
        Account a1 = new Account(101, "John Doe");
        Account a2 = new Account(102, "Jane Smith");

        System.out.println( a1.acc_name);
        System.out.println( a2.acc_name);
    }
    
}

