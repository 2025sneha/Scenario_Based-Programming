import java.util.Scanner;

class program797
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please enter your current balance : ");
        int Current_Balance = sobj.nextInt();

        System.out.println("Please enter your amount that you want to withdraw  : ");
        int withdraw_Amount = sobj.nextInt();

        if((Current_Balance < 0) || (withdraw_Amount <= 0))
        {
            System.out.println("Invalid Input");
            return;
        }

        if(withdraw_Amount % 100 != 0)
        {
            System.out.println("Transaction Failed: Withdrawal amount must be a multiple of 100");
        }
        else if(withdraw_Amount > 2500)
        {
            System.out.println(" Transaction Failed: Maximum withdrawal per transaction is 25,000");
        }
        else if(Current_Balance - withdraw_Amount < 1000)
        {
            System.out.println("Transaction Failed: After withdrawal, balance must remains at least 1000");
        }
        else 
        {
            System.out.println("Transaction Successful");
            System.out.println("Remaining Balance : "+(Current_Balance-withdraw_Amount));
        }
    }
}