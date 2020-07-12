import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import javax.swing.*;
public class ZXBankTest
{
 private String accno;
 private String name;
 private long balance;

 Scanner KB=new Scanner(System.in);
 
 //method to open an account
 void openAccount()
 { 
  System.out.print("Enter Account No: ");
  accno=KB.next();
  System.out.print("Enter Name: ");
  name=KB.next();
  System.out.print("Enter Balance: ");
  balance=KB.nextLong();
 }

 //method to display account details
 void showAccount()
 { 
  System.out.println("Account Number:"+ accno+ "" + " Name:"+ name+ " Balance:" + "$"+balance);
  //method of a delay to display new acount amount
  try {
   TimeUnit.SECONDS.sleep(3);
  } catch (InterruptedException e) {
   e.printStackTrace();
  }

 }
 

 //method to deposit money
 void deposit()
 {
  long amt;
  System.out.println("Enter Amount U Want to Deposit : ");
  amt=KB.nextLong();
  balance=balance+amt;
  System.out.println("Here's your new balance for "+ name + " $" + balance);
 
  //method of a delay to display new acount amount
  try {
   TimeUnit.SECONDS.sleep(3);
  } catch (InterruptedException e) {
   e.printStackTrace();
  }

 }

 //method to withdraw money
 void withdrawal()
 {
   long amt;
  System.out.println("Enter Amount U Want to Deposit : ");
  amt=KB.nextLong();
  balance=balance-amt;
  System.out.println("Here's your new balance for "+ name + " $" + balance);
 
  //method of a delay to display new acount amount
  try {
   TimeUnit.SECONDS.sleep(3);
  } catch (InterruptedException e) {
   e.printStackTrace();
  }
  
 }
 
 //method to edit your name
 void name(){
 
   System.out.println("Edit your Account Name. Type your new acount name below");
   name=KB.next();
   System.out.println("Here's your new Name: "+ name );
  
   try {
   TimeUnit.SECONDS.sleep(3);
  } catch (InterruptedException e) {
   e.printStackTrace();
  }
 
}
 
 // method to edi you account number
 void number(){
 
   System.out.println("Edit your Account Number. Type your new acount number below");
   accno=KB.next();
   System.out.println("Here's your new Number is "+ accno );
  
   try {
   TimeUnit.SECONDS.sleep(3);
  } catch (InterruptedException e) {
   e.printStackTrace();
  }
 
}
 
  //method to search an account number
 boolean search(String acn)
 { 
  if(accno.equals(acn))
  { 
   showAccount();
   return(true);
  }
  return(false);
 }
 
}
