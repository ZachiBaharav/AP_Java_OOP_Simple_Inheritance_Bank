

public class Main {

    public static void main(String[] args) {
        
        CheckingAccount c1 = new CheckingAccount(10.0);
        SavingAccount   s1 = new SavingAccount(20);
        
        System.out.println("Checking:: Account balanace:" + c1.getBalanace());
        System.out.println("Saving:: Account balanace:" + s1.getBalanace());
        
    }
    
    
}
