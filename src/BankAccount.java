import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int balance= 600;
        System.out.println("Enter amount to withdraw: ");
        double withdraw= (scanner.nextDouble());
        if(withdraw%5==0 && withdraw+0.50<=balance){
            System.out.println(balance-withdraw-0.50);
        }
    }
}
