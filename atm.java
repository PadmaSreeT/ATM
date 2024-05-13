package ram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Padmajava {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("ATM MACHINE:");
		int n=0;
		int e=0;
		int u=0;
		int balance=0;
		int c=0;
		int hi=0;
		int pp=0;
		int xx=0;
		int a=0;
		System.out.println("DO YOU WANT TO DO ANY TRANSACTION??????");
		System.out.println("press enter or type 'no'");
		InputStreamReader read = new InputStreamReader(System.in);
	    BufferedReader in=new BufferedReader(read); 
	    String answer=in.readLine();
	    if (!answer.equals("no"))
	    {
		System.out.println("1.CREATE ACCOUNT:");
		System.out.println("2.DEPOSIT:");
		System.out.println("3.WITHDRAW:");
		System.out.println("4.CHECK BALANCE:");
		System.out.println("5.EXIT:");
		for (int i=1;i>n;i++)
		{
			if (xx==0)
			{
		System.out.println("Enter Your Choice:");
		InputStreamReader re=new InputStreamReader(System.in);
		BufferedReader brr=new BufferedReader(re);
		 a=Integer.parseInt(brr.readLine());
		 if(a==5 || hi==4)
			{
				
			System.out.println("THANKYOU!!!!");
              pp=0;
              xx=1;
		    }
	    if(a<=4 && a!=0)
		{
	    	System.out.println("Enter Your Phone Number for creating account:");
			InputStreamReader reads = new InputStreamReader(System.in);
			BufferedReader inn=new BufferedReader(reads); 
		    String answerr=inn.readLine();
			System.out.println("Create Pin:");
			System.out.println("pin consists of 4 characters");
			InputStreamReader reee=new InputStreamReader(System.in);			
			BufferedReader brrr=new BufferedReader(reee);
			c=Integer.parseInt(brrr.readLine());
			int length=answerr.length();
			int length1=String.valueOf(c).length();
			if (length==10 && length1==4)
			{
				System.out.println("ACCOUNT CREATED SUCCESSFULLY");
				pp=1;
		     }
			else
			{
				System.out.println("ACCOUNT NOT CREATED ");
			}
			boolean exit = false;
			while(!exit)
			{
				if(pp==1)
				{
				System.out.println("Enter Your Choice:");
				System.out.println("1.DEPOSIT:");
				System.out.println("2.WITHDRAW:");
				System.out.println("3.CHECK BALANCE:");
				System.out.println("4.EXIT:");
				InputStreamReader q=new InputStreamReader(System.in);
				BufferedReader mm=new BufferedReader(q);
			    hi=Integer.parseInt(mm.readLine());
			 if(a==2 || hi==1)
			{
				System.out.println("DEPOSIT:");
				System.out.println("Enter Your Phone Number:");
				InputStreamReader readss = new InputStreamReader(System.in);
			    BufferedReader innn=new BufferedReader(readss); 
			    String r=innn.readLine();
				System.out.println("enter Pin:");
				InputStreamReader reeee=new InputStreamReader(System.in);
				BufferedReader brrrr=new BufferedReader(reeee);
				int d=Integer.parseInt(brrrr.readLine());
				if(answerr.equals(r) && c==d)
				{
					System.out.println("how much amount you want to deposit:");
					InputStreamReader reeeee=new InputStreamReader(System.in);
					BufferedReader brrrrr=new BufferedReader(reeeee);
					 e=Integer.parseInt(brrrrr.readLine());
					 balance=balance+e;
					 System.out.println("Balance:"+balance);
					 pp=1;
				}
				else
				{
					System.out.println("INVALID PHONE NUMBER OR PIN");
					pp=1;
				}
				}
		      if(a==3 || hi==2)
			{
				System.out.println("WITHDRAW:");
				System.out.println("Enter Your Phone Number:");
				InputStreamReader readsss = new InputStreamReader(System.in);
			    BufferedReader innnn=new BufferedReader(readsss); 
			    String s=innnn.readLine();
				System.out.println("enter Pin:");
				InputStreamReader reeeee=new InputStreamReader(System.in);
				BufferedReader brrrrr=new BufferedReader(reeeee);
				int t=Integer.parseInt(brrrrr.readLine());
				if(answerr.equals(s) && c==t)
				{
					System.out.println("how much amount you want to withdraw:");
					InputStreamReader reeeeeee=new InputStreamReader(System.in);
					BufferedReader brrrrrrr=new BufferedReader(reeeeeee);
					 u=Integer.parseInt(brrrrrrr.readLine());
					 if(u<=balance)
					 {
						 balance=balance-u;
						 System.out.println("Balance:"+balance); 
						 pp=1;
					 }
					 else
					 {
						 System.out.println("INSUFFICIENT BALANCE");
						 pp=1;
					 }
				}
				else
				{
					System.out.println("INVALID PHONE NUMBER OR PIN");
					pp=1;
				}
			}
			 if(a==4 || hi==3)
			{
				System.out.println("CHECK BALANCE:");
				System.out.println("Enter Your Phone Number:");
				InputStreamReader readssssss = new InputStreamReader(System.in);
			    BufferedReader innnnnnn=new BufferedReader(readssssss); 
			    String z=innnnnnn.readLine();
				System.out.println("enter Pin:");
				InputStreamReader reeeeeee=new InputStreamReader(System.in);
				BufferedReader brrrrrrr=new BufferedReader(reeeeeee);
				int y=Integer.parseInt(brrrrrrr.readLine());
				if(answerr.equals(z) && c==y)
				{
					System.out.println("CHECK BALANCE:"+balance);
					pp=1;
				}
				else
				{
					System.out.println("INVALID PHONE NUMBER OR PIN");
					pp=1;
				}
			} 
			 if(a==5 || hi==4)
			{
				
				System.out.println("THANKYOU!!!!");
                 pp=0;
                 xx=1;
		}
			}
		}
		}
			
		}
		
		
		if(a>5 && a==0)
	    {
	    	System.out.println("ENTER CORRECT INPUT!!!");
	    }
 
		}
	    }
	    
	    if(answer.equals("no"))
	    {
	    	System.out.println("THANKYOU FOR VISITING");
	    	n=1;
	    }
	    }

	}