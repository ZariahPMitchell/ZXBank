import java.util.Scanner;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;
public class ZXBank
{  
 public static void main(String arg[])
 {
   
   
  Scanner KB= new Scanner(System.in);
  
  //create initial accounts
   System.out.println("---------------------");
   System.out.println("WELCOME TO ZX BANK");
   System.out.println("---------------------");
   System.out.print("How Many Accounts Do You Want To Open Up? ");
  int n=KB.nextInt();
  ZXBankTest C[]=new ZXBankTest[n];
  for(int i=0;i<C.length;i++)
  {   
   C[i]=new ZXBankTest();
   C[i].openAccount();
  }
  
  //loop runs until menu 5 is not pressed
  int ch;
  do
  {
   System.out.println( "Main Menu\n"
   + 1 + ".Display All\n"
   + 2 + ".Search By Account\n" 
   + 3 + ".Deposit\n" 
   + 4 + ".Withdrawal\n"
   + 5 + ".Change Account Name\n"        
   + 6 + ".Change Account Number\n"                      
   + 7 + ".Log Out");
   System.out.println("You can type in a number from the numbers listed from above :");
   ch=KB.nextInt();
   switch(ch)
   { 
    case 1:
     for(int i=0;i<C.length;i++)
     {
      C[i].showAccount();
     }
     break;

    case 2:
     System.out.print("Enter Account Number you Want to Search for: ");
     String acn=KB.next();
     boolean found=false;
     for(int i=0;i<C.length;i++)
     {  
      found=C[i].search(acn);
      if(found)
      {
       break;
      }
     }
     if(!found)
     {
      System.out.println("Search Failed..Account Not Exist..");
     }
     break;

    case 3:
     System.out.print("Enter Account Number : ");
     acn=KB.next();
     found=false;
     for(int i=0;i<C.length;i++)
     {  
      found=C[i].search(acn);
      if(found)
      {
       C[i].deposit();
       break;
      }
     }
     if(!found)
     {
      System.out.println("Search Failed..Account Not Exist..");
     }
     break;
     

    case 4:
     System.out.print("Enter Account Number : ");
     acn=KB.next();
     found=false;
     for(int i=0;i<C.length;i++)
     { 
      found=C[i].search(acn);
      if(found)
      {
       C[i].withdrawal();
       break;
      }
     }
     if(!found)
     {
      System.out.println("Search Failed..Account Not Exist..");
     }
     break;
     
  case 5:
 System.out.print("Enter Account Number: ");
 acn=KB.next();
     found=false;
     for(int i=0;i<C.length;i++)
     {  
      found=C[i].search(acn);
      if(found)
      {
      C[i].name();
       break;
      }
     }
     if(!found)
     {
      System.out.println("Search Failed..Account Not Exist..");
     }
     break;
  
  case 6:
 System.out.print("Enter Account Number: ");
 acn=KB.next();
     found=false;
     for(int i=0;i<C.length;i++)
     {  
      found=C[i].search(acn);
      if(found)
      {
      C[i].number();
       break;
      }
     }
     if(!found)
     {
      System.out.println("Search Failed..Account Not Exist..");
     }
     break;
     
     
     case 7:
     System.out.println("Good Bye..");
     break;
   }
  }
  while(ch!=7);

 }
}
