package projects;
import java.util.*;
public class BankingApplication {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount("Ayush", "AW@34");
        obj.showMenu();
        
    }  
}

class BankAccount{
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String cname, String cid){
        customerName = cname;
        customerId = cid;
    }

    void deposit(int amount){
        if(amount != 0){
            balance += amount;
            previousTransaction = amount;
        }
    }
    void withdraw(int amount){
        if(amount != 0){
            balance -= amount;
            previousTransaction = -amount;
        }
    }
    void getPreviousTransaction(){
        if(previousTransaction > 0){
            System.out.println("Deposited :"+previousTransaction);
        }
        else if(previousTransaction < 0){
            System.out.println("Withdrawn :"+(Math.abs(previousTransaction)));
        }else{
            System.out.println("No Transaction Occured");
        }
    }
    void showMenu(){
        char option ='0';
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome "+customerName);
        System.out.println("Your ID is: "+customerId);
        System.out.println();
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous TRansaction");
        System.out.println("E. Exit");
    

    do{
        System.out.println("================================================================================================");
        System.out.println("Enter an option:");
        System.out.println("================================================================================================");
        option = sc.next().charAt(0);
        System.out.println("\n");

        switch(option){
            case 'A': 
            System.out.println("Balance:"+balance);
            break;

            case 'B':
            System.out.println("Enter an amount to deposit: ");
            int amount = sc.nextInt();
            deposit(amount);
            break;
            case 'C':

            System.out.println("Enter an amount to withdraw: ");
            int amount2 = sc.nextInt();
            withdraw(amount2);
            break;

            case 'D':
            getPreviousTransaction();
            break;

            case 'E':
            System.out.println("Thanks for your services!!");
            break;

            default:
            System.out.println("Invalid option!!.Please Enter again");
        }
        
    }while(option != 'E');
   
    }
}